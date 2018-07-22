package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import com.jossemargt.cmsgalatea.service.api.SubmissionFormatElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = SubmissionFormatElementDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = SubmissionFormatElement.class)
public class SubmissionFormatElementDeserializer extends JsonObjectDeserializer<SubmissionFormatElement> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SubmissionFormatElementService submissionFormatElementService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param submissionFormatElementService
     * @param conversionService
     */
    @Autowired
    public SubmissionFormatElementDeserializer(@Lazy SubmissionFormatElementService submissionFormatElementService, ConversionService conversionService) {
        this.submissionFormatElementService = submissionFormatElementService;
        this.conversionService = conversionService;
    }
}
