package com.jossemargt.cmsgalatea.service.impl;
import com.jossemargt.cmsgalatea.service.api.TaskService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import com.jossemargt.cmsgalatea.model.Contest;
import com.jossemargt.cmsgalatea.model.Task;
import com.jossemargt.cmsgalatea.repository.TaskRepository;
import com.jossemargt.cmsgalatea.service.api.AttachmentService;
import com.jossemargt.cmsgalatea.service.api.StatementService;
import com.jossemargt.cmsgalatea.service.api.SubmissionFormatElementService;
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
 * = TaskServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = TaskService.class)
@Service
@Transactional(readOnly = true)
public class TaskServiceImpl implements TaskService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private StatementService statementService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SubmissionFormatElementService submissionFormatElementService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AttachmentService attachmentService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskRepository taskRepository;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskRepository
     * @param attachmentService
     * @param statementService
     * @param submissionFormatElementService
     */
    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, @Lazy AttachmentService attachmentService, @Lazy StatementService statementService, @Lazy SubmissionFormatElementService submissionFormatElementService) {
        setTaskRepository(taskRepository);
        setAttachmentService(attachmentService);
        setStatementService(statementService);
        setSubmissionFormatElementService(submissionFormatElementService);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return TaskRepository
     */
    public TaskRepository getTaskRepository() {
        return taskRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param taskRepository
     */
    public void setTaskRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return AttachmentService
     */
    public AttachmentService getAttachmentService() {
        return attachmentService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param attachmentService
     */
    public void setAttachmentService(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return StatementService
     */
    public StatementService getStatementService() {
        return statementService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param statementService
     */
    public void setStatementService(StatementService statementService) {
        this.statementService = statementService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return SubmissionFormatElementService
     */
    public SubmissionFormatElementService getSubmissionFormatElementService() {
        return submissionFormatElementService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param submissionFormatElementService
     */
    public void setSubmissionFormatElementService(SubmissionFormatElementService submissionFormatElementService) {
        this.submissionFormatElementService = submissionFormatElementService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return Map
     */
    public Map<String, List<MessageI18n>> validate(Task task) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        return messages;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Task
     */
    public Task findOne(Long id) {
    	System.out.println("-------dfasdfasdffffffffffff--------------");
        return getTaskRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Task
     */
    public Task findTaskByIdAndLang(Long id, String lang) {
        return getTaskRepository().findTaskByIdAndLang(id, lang);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public List<Task> findAll(Iterable<Long> ids) {
        return getTaskRepository().findAll(ids);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public List<Task> findAll() {
        return getTaskRepository().findAll();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    public long count() {
        return getTaskRepository().count();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Task> findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getTaskRepository().findAll(globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Task> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getTaskRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contest
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Task> findByContest(Contest contest, GlobalSearch globalSearch, Pageable pageable) {
        return getTaskRepository().findByContest(contest, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contest
     * @return Long
     */
    public long countByContest(Contest contest) {
        return getTaskRepository().countByContest(contest);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param name
     * @param pageable
     * @return Page
     */
    public Page<Task> findByName(String name, Pageable pageable) {
        return getTaskRepository().findByName(name, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param name
     * @return Long
     */
    public long countByName(String name) {
        return getTaskRepository().countByName(name);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Task> getEntityType() {
        return Task.class;
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
