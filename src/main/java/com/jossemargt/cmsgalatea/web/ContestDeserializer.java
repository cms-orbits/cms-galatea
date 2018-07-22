package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Contest;
import com.jossemargt.cmsgalatea.service.api.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ContestDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Contest.class)
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
}
