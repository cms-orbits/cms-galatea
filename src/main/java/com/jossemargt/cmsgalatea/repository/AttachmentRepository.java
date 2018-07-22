package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Attachment;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import com.jossemargt.cmsgalatea.model.Task;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AttachmentRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Attachment.class)
@Transactional(readOnly = true)
public interface AttachmentRepository extends ReadOnlyRepository<Attachment, Long>, AttachmentRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return Long
     */
    public abstract long countByTask(Task task);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Attachment
     */
    public abstract Attachment findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return List
     */
    public abstract List<Attachment> findAll(Iterable<Long> id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param attachment
     * @return Attachment
     */
    public abstract Attachment save(Attachment attachment);
}
