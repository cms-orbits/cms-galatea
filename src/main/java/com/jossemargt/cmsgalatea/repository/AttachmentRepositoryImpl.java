package com.jossemargt.cmsgalatea.repository;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.Attachment;
import com.jossemargt.cmsgalatea.model.QAttachment;
import com.jossemargt.cmsgalatea.model.Task;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = AttachmentRepositoryImpl
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustomImpl(repository = AttachmentRepositoryCustom.class)
@Transactional(readOnly = true)
public class AttachmentRepositoryImpl extends QueryDslRepositorySupportExt<Attachment> implements AttachmentRepositoryCustom {

    /**
     * Default constructor
     */
    AttachmentRepositoryImpl() {
        super(Attachment.class);
    }

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TASK = "task";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String CONTENT = "content";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String FILENAME = "filename";

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Attachment> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable) {
        QAttachment attachment = QAttachment.attachment;
        JPQLQuery<Attachment> query = from(attachment);
        Assert.notNull(task, "task is required");
        query.where(attachment.task.eq(task));
        Path<?>[] paths = new Path<?>[] { attachment.filename, attachment.content, attachment.task };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(FILENAME, attachment.filename).map(CONTENT, attachment.content).map(TASK, attachment.task);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, attachment);
    }
}
