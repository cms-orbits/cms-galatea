package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Statement;
import com.jossemargt.cmsgalatea.service.api.StatementService;
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
 * = StatementDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Statement.class)
@JsonComponent
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

    /**
     * TODO Auto-generated method documentation
     *
     * @return StatementService
     */
    public StatementService getStatementService() {
        return statementService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param statementService
     */
    public void setStatementService(StatementService statementService) {
        this.statementService = statementService;
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
     * @return Statement
     */
    public Statement deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        Statement statement = statementService.findOne(id);
        if (statement == null) {
            throw new NotFoundException("Statement not found");
        }
        return statement;
    }
}
