package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Attachment;
import com.jossemargt.cmsgalatea.service.api.AttachmentService;
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
 * = AttachmentDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Attachment.class)
@JsonComponent
public class AttachmentDeserializer extends JsonObjectDeserializer<Attachment> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AttachmentService attachmentService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param attachmentService
     * @param conversionService
     */
    @Autowired
    public AttachmentDeserializer(@Lazy AttachmentService attachmentService, ConversionService conversionService) {
        this.attachmentService = attachmentService;
        this.conversionService = conversionService;
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
     * @return Attachment
     */
    public Attachment deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        Attachment attachment = attachmentService.findOne(id);
        if (attachment == null) {
            throw new NotFoundException("Attachment not found");
        }
        return attachment;
    }
}
