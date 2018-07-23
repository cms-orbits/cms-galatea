package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import com.jossemargt.cmsgalatea.service.api.SubmissionFormatElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import io.springlets.web.NotFoundException;
import org.springframework.boot.jackson.JsonComponent;

/**
 * = SubmissionFormatElementDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = SubmissionFormatElement.class)
@JsonComponent
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
     * @return ConversionService
     */
    public ConversionService getConversionService() {
        return conversionService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param conversionService
     */
    public void setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return SubmissionFormatElement
     */
    public SubmissionFormatElement deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        SubmissionFormatElement submissionFormatElement = submissionFormatElementService.findOne(id);
        if (submissionFormatElement == null) {
            throw new NotFoundException("SubmissionFormatElement not found");
        }
        return submissionFormatElement;
    }
}
