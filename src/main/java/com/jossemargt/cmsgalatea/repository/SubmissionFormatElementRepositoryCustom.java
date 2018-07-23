package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustom;
import com.jossemargt.cmsgalatea.model.Task;
import io.springlets.data.domain.GlobalSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = SubmissionFormatElementRepositoryCustom
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustom(entity = SubmissionFormatElement.class)
public interface SubmissionFormatElementRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<SubmissionFormatElement> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable);
}
