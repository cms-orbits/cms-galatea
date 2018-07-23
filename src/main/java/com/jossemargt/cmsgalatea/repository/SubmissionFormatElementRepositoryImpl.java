package com.jossemargt.cmsgalatea.repository;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import com.jossemargt.cmsgalatea.model.QSubmissionFormatElement;
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
 * = SubmissionFormatElementRepositoryImpl
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustomImpl(repository = SubmissionFormatElementRepositoryCustom.class)
@Transactional(readOnly = true)
public class SubmissionFormatElementRepositoryImpl extends QueryDslRepositorySupportExt<SubmissionFormatElement> implements SubmissionFormatElementRepositoryCustom {

    /**
     * Default constructor
     */
    SubmissionFormatElementRepositoryImpl() {
        super(SubmissionFormatElement.class);
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
    public static final String FILENAME = "filename";

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<SubmissionFormatElement> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable) {
        QSubmissionFormatElement submissionFormatElement = QSubmissionFormatElement.submissionFormatElement;
        JPQLQuery<SubmissionFormatElement> query = from(submissionFormatElement);
        Assert.notNull(task, "task is required");
        query.where(submissionFormatElement.task.eq(task));
        Path<?>[] paths = new Path<?>[] { submissionFormatElement.filename, submissionFormatElement.task };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(FILENAME, submissionFormatElement.filename).map(TASK, submissionFormatElement.task);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, submissionFormatElement);
    }
}
