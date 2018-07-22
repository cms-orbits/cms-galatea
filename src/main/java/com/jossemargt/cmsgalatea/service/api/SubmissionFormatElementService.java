package com.jossemargt.cmsgalatea.service.api;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import com.jossemargt.cmsgalatea.model.Task;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = SubmissionFormatElementService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = SubmissionFormatElement.class)
public interface SubmissionFormatElementService extends EntityResolver<SubmissionFormatElement, Long>, ValidatorService<SubmissionFormatElement> {

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
     * @param ids
     * @return List
     */
    public abstract List<SubmissionFormatElement> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<SubmissionFormatElement> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return Long
     */
    public abstract long countByTask(Task task);
}
