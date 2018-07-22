package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.ExecutionScenario;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import com.jossemargt.cmsgalatea.model.Dataset;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ExecutionScenarioRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ExecutionScenario.class)
@Transactional(readOnly = true)
public interface ExecutionScenarioRepository extends ReadOnlyRepository<ExecutionScenario, Long>, ExecutionScenarioRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param dataset
     * @return Long
     */
    public abstract long countByDataset(Dataset dataset);
}
