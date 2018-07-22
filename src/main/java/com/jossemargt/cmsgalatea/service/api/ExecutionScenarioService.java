package com.jossemargt.cmsgalatea.service.api;
import com.jossemargt.cmsgalatea.model.ExecutionScenario;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import com.jossemargt.cmsgalatea.model.Dataset;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ExecutionScenarioService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ExecutionScenario.class)
public interface ExecutionScenarioService extends EntityResolver<ExecutionScenario, Long>, ValidatorService<ExecutionScenario> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return ExecutionScenario
     */
    public abstract ExecutionScenario findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public abstract List<ExecutionScenario> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public abstract List<ExecutionScenario> findAll();

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    public abstract long count();

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
     * @param dataset
     * @return Long
     */
    public abstract long countByDataset(Dataset dataset);
}
