package com.jossemargt.cmsgalatea.service.impl;
import com.jossemargt.cmsgalatea.service.api.AttachmentService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import com.jossemargt.cmsgalatea.model.Attachment;
import com.jossemargt.cmsgalatea.model.Task;
import com.jossemargt.cmsgalatea.repository.AttachmentRepository;
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
 * = AttachmentServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = AttachmentService.class)
@Service
@Transactional(readOnly = true)
public class AttachmentServiceImpl implements AttachmentService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AttachmentRepository attachmentRepository;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param attachmentRepository
     */
    @Autowired
    public AttachmentServiceImpl(AttachmentRepository attachmentRepository) {
        setAttachmentRepository(attachmentRepository);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return AttachmentRepository
     */
    public AttachmentRepository getAttachmentRepository() {
        return attachmentRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param attachmentRepository
     */
    public void setAttachmentRepository(AttachmentRepository attachmentRepository) {
        this.attachmentRepository = attachmentRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param attachment
     * @return Map
     */
    public Map<String, List<MessageI18n>> validate(Attachment attachment) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        return messages;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Attachment
     */
    public Attachment findOne(Long id) {
        return getAttachmentRepository().findOne(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public List<Attachment> findAll(Iterable<Long> ids) {
        return getAttachmentRepository().findAll(ids);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Attachment> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable) {
        return getAttachmentRepository().findByTask(task, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return Long
     */
    public long countByTask(Task task) {
        return getAttachmentRepository().countByTask(task);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Attachment> getEntityType() {
        return Attachment.class;
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
