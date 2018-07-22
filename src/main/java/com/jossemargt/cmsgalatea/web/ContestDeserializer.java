package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Contest;
import com.jossemargt.cmsgalatea.service.api.ContestService;
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
 * = ContestDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Contest.class)
@JsonComponent
public class ContestDeserializer extends JsonObjectDeserializer<Contest> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ContestService contestService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param contestService
     * @param conversionService
     */
    @Autowired
    public ContestDeserializer(@Lazy ContestService contestService, ConversionService conversionService) {
        this.contestService = contestService;
        this.conversionService = conversionService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return ContestService
     */
    public ContestService getContestService() {
        return contestService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contestService
     */
    public void setContestService(ContestService contestService) {
        this.contestService = contestService;
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
     * @return Contest
     */
    public Contest deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        Contest contest = contestService.findOne(id);
        if (contest == null) {
            throw new NotFoundException("Contest not found");
        }
        return contest;
    }
}
