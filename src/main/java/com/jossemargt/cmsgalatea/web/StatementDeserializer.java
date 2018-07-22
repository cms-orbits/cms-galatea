package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Statement;
import com.jossemargt.cmsgalatea.service.api.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = StatementDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Statement.class)
public class StatementDeserializer extends JsonObjectDeserializer<Statement> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private StatementService statementService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param statementService
     * @param conversionService
     */
    @Autowired
    public StatementDeserializer(@Lazy StatementService statementService, ConversionService conversionService) {
        this.statementService = statementService;
        this.conversionService = conversionService;
    }
}
