package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.ExecutionScenario;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustom;
import com.jossemargt.cmsgalatea.model.Dataset;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ExecutionScenarioRepositoryCustom
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustom(entity = ExecutionScenario.class)
public interface ExecutionScenarioRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param dataset
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ExecutionScenario> findByDataset(Dataset dataset, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ExecutionScenario> findAll(GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ExecutionScenario> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
