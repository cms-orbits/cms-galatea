package com.jossemargt.cmsgalatea.service.impl;
import com.jossemargt.cmsgalatea.service.api.ContestService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import com.jossemargt.cmsgalatea.model.Contest;
import com.jossemargt.cmsgalatea.model.ContestByName;
import com.jossemargt.cmsgalatea.model.ContestInfo;
import com.jossemargt.cmsgalatea.repository.ContestRepository;
import com.jossemargt.cmsgalatea.service.api.TaskService;
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
 * = ContestServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = ContestService.class)
@Service
@Transactional(readOnly = true)
public class ContestServiceImpl implements ContestService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ContestRepository contestRepository;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskService taskService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param contestRepository
     * @param taskService
     */
    @Autowired
    public ContestServiceImpl(ContestRepository contestRepository, @Lazy TaskService taskService) {
        setContestRepository(contestRepository);
        setTaskService(taskService);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return ContestRepository
     */
    public ContestRepository getContestRepository() {
        return contestRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contestRepository
     */
    public void setContestRepository(ContestRepository contestRepository) {
        this.contestRepository = contestRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return TaskService
     */
    public TaskService getTaskService() {
        return taskService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param taskService
     */
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contest
     * @return Map
     */
    public Map<String, List<MessageI18n>> validate(Contest contest) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        return messages;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Contest
     */
    public Contest findOne(Long id) {
        return getContestRepository().findOne(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public List<Contest> findAll(Iterable<Long> ids) {
        return getContestRepository().findAll(ids);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public List<Contest> findAll() {
        return getContestRepository().findAll();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    public long count() {
        return getContestRepository().count();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ContestInfo> findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getContestRepository().findAll(globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ContestInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getContestRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param formBean
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ContestInfo> findByName(ContestByName formBean, GlobalSearch globalSearch, Pageable pageable) {
        return getContestRepository().findByName(formBean, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param formBean
     * @return Long
     */
    public long countByName(ContestByName formBean) {
        return getContestRepository().countByName(formBean);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Contest> getEntityType() {
        return Contest.class;
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
