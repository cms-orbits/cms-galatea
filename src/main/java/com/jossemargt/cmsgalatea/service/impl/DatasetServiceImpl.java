package com.jossemargt.cmsgalatea.service.impl;
import com.jossemargt.cmsgalatea.service.api.DatasetService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import com.jossemargt.cmsgalatea.model.Dataset;
import com.jossemargt.cmsgalatea.model.DatasetInfo;
import com.jossemargt.cmsgalatea.model.Task;
import com.jossemargt.cmsgalatea.repository.DatasetRepository;
import com.jossemargt.cmsgalatea.service.api.ExecutionScenarioService;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * = DatasetServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = DatasetService.class)
@Service
@Transactional(readOnly = true)
public class DatasetServiceImpl implements DatasetService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private DatasetRepository datasetRepository;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ExecutionScenarioService executionScenarioService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param datasetRepository
     * @param executionScenarioService
     */
    @Autowired
    public DatasetServiceImpl(DatasetRepository datasetRepository, @Lazy ExecutionScenarioService executionScenarioService) {
        setDatasetRepository(datasetRepository);
        setExecutionScenarioService(executionScenarioService);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return DatasetRepository
     */
    public DatasetRepository getDatasetRepository() {
        return datasetRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param datasetRepository
     */
    public void setDatasetRepository(DatasetRepository datasetRepository) {
        this.datasetRepository = datasetRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return ExecutionScenarioService
     */
    public ExecutionScenarioService getExecutionScenarioService() {
        return executionScenarioService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param executionScenarioService
     */
    public void setExecutionScenarioService(ExecutionScenarioService executionScenarioService) {
        this.executionScenarioService = executionScenarioService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param dataset
     * @return Map
     */
    public Map<String, List<MessageI18n>> validate(Dataset dataset) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        return messages;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Dataset
     */
    public Dataset findOne(Long id) {
        return getDatasetRepository().findOne(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public List<Dataset> findAll(Iterable<Long> ids) {
        return getDatasetRepository().findAll(ids);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public List<Dataset> findAll() {
        return getDatasetRepository().findAll();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    public long count() {
        return getDatasetRepository().count();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<DatasetInfo> findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getDatasetRepository().findAll(globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<DatasetInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getDatasetRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<DatasetInfo> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable) {
        return getDatasetRepository().findByTask(task, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return Long
     */
    public long countByTask(Task task) {
        return getDatasetRepository().countByTask(task);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Dataset> getEntityType() {
        return Dataset.class;
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
