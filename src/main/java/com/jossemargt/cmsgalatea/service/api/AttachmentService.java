package com.jossemargt.cmsgalatea.service.api;
import com.jossemargt.cmsgalatea.model.Attachment;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = AttachmentService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Attachment.class)
public interface AttachmentService extends EntityResolver<Attachment, Long>, ValidatorService<Attachment> {
}
