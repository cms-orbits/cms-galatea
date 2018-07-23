package com.jossemargt.cmsgalatea.service.impl;
import com.jossemargt.cmsgalatea.service.api.ExecutionScenarioService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import com.jossemargt.cmsgalatea.model.Dataset;
import com.jossemargt.cmsgalatea.model.ExecutionScenario;
import com.jossemargt.cmsgalatea.repository.ExecutionScenarioRepository;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ExecutionScenarioServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = ExecutionScenarioService.class)
@Service
@Transactional(readOnly = true)
public class ExecutionScenarioServiceImpl implements ExecutionScenarioService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ExecutionScenarioRepository executionScenarioRepository;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param executionScenarioRepository
     */
    @Autowired
    public ExecutionScenarioServiceImpl(ExecutionScenarioRepository executionScenarioRepository) {
        setExecutionScenarioRepository(executionScenarioRepository);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return ExecutionScenarioRepository
     */
    public ExecutionScenarioRepository getExecutionScenarioRepository() {
        return executionScenarioRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param executionScenarioRepository
     */
    public void setExecutionScenarioRepository(ExecutionScenarioRepository executionScenarioRepository) {
        this.executionScenarioRepository = executionScenarioRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param executionscenario
     * @return Map
     */
    public Map<String, List<MessageI18n>> validate(ExecutionScenario executionscenario) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        return messages;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return ExecutionScenario
     */
    public ExecutionScenario findOne(Long id) {
        return getExecutionScenarioRepository().findOne(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public List<ExecutionScenario> findAll(Iterable<Long> ids) {
        return getExecutionScenarioRepository().findAll(ids);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public List<ExecutionScenario> findAll() {
        return getExecutionScenarioRepository().findAll();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    public long count() {
        return getExecutionScenarioRepository().count();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ExecutionScenario> findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getExecutionScenarioRepository().findAll(globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ExecutionScenario> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getExecutionScenarioRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param dataset
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ExecutionScenario> findByDataset(Dataset dataset, GlobalSearch globalSearch, Pageable pageable) {
        return getExecutionScenarioRepository().findByDataset(dataset, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param dataset
     * @return Long
     */
    public long countByDataset(Dataset dataset) {
        return getExecutionScenarioRepository().countByDataset(dataset);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<ExecutionScenario> getEntityType() {
        return ExecutionScenario.class;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Long> getIdType() {
        return Long.class;
    }
}
