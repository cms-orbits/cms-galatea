package com.jossemargt.cmsgalatea.service.api;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = SubmissionFormatElementService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = SubmissionFormatElement.class)
public interface SubmissionFormatElementService extends EntityResolver<SubmissionFormatElement, Long>, ValidatorService<SubmissionFormatElement> {
}
