package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import com.jossemargt.cmsgalatea.model.Task;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 * = SubmissionFormatElementRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = SubmissionFormatElement.class)
@Transactional(readOnly = true)
public interface SubmissionFormatElementRepository extends ReadOnlyRepository<SubmissionFormatElement, Long>, SubmissionFormatElementRepositoryCustom {

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
     * @return SubmissionFormatElement
     */
    public abstract SubmissionFormatElement findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return List
     */
    public abstract List<SubmissionFormatElement> findAll(Iterable<Long> id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param submissionFormatElement
     * @return SubmissionFormatElement
     */
    public abstract SubmissionFormatElement save(SubmissionFormatElement submissionFormatElement);
}
