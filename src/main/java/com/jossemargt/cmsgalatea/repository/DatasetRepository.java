package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Dataset;
import com.jossemargt.cmsgalatea.model.DatasetInfo;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import com.jossemargt.cmsgalatea.model.Task;
import org.springframework.transaction.annotation.Transactional;

/**
 * = DatasetRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Dataset.class, defaultReturnType = DatasetInfo.class)
@Transactional(readOnly = true)
public interface DatasetRepository extends ReadOnlyRepository<Dataset, Long>, DatasetRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return Long
     */
    public abstract long countByTask(Task task);
}
