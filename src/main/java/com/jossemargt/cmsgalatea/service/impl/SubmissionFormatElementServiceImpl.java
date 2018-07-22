package com.jossemargt.cmsgalatea.service.impl;
import com.jossemargt.cmsgalatea.service.api.SubmissionFormatElementService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import com.jossemargt.cmsgalatea.model.Task;
import com.jossemargt.cmsgalatea.repository.SubmissionFormatElementRepository;
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
 * = SubmissionFormatElementServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = SubmissionFormatElementService.class)
@Service
@Transactional(readOnly = true)
public class SubmissionFormatElementServiceImpl implements SubmissionFormatElementService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SubmissionFormatElementRepository submissionFormatElementRepository;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param submissionFormatElementRepository
     */
    @Autowired
    public SubmissionFormatElementServiceImpl(SubmissionFormatElementRepository submissionFormatElementRepository) {
        setSubmissionFormatElementRepository(submissionFormatElementRepository);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return SubmissionFormatElementRepository
     */
    public SubmissionFormatElementRepository getSubmissionFormatElementRepository() {
        return submissionFormatElementRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param submissionFormatElementRepository
     */
    public void setSubmissionFormatElementRepository(SubmissionFormatElementRepository submissionFormatElementRepository) {
        this.submissionFormatElementRepository = submissionFormatElementRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param submissionformatelement
     * @return Map
     */
    public Map<String, List<MessageI18n>> validate(SubmissionFormatElement submissionformatelement) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        return messages;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return SubmissionFormatElement
     */
    public SubmissionFormatElement findOne(Long id) {
        return getSubmissionFormatElementRepository().findOne(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public List<SubmissionFormatElement> findAll(Iterable<Long> ids) {
        return getSubmissionFormatElementRepository().findAll(ids);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<SubmissionFormatElement> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable) {
        return getSubmissionFormatElementRepository().findByTask(task, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return Long
     */
    public long countByTask(Task task) {
        return getSubmissionFormatElementRepository().countByTask(task);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<SubmissionFormatElement> getEntityType() {
        return SubmissionFormatElement.class;
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
