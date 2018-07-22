package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Dataset;
import com.jossemargt.cmsgalatea.service.api.DatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = DatasetDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Dataset.class)
public class DatasetDeserializer extends JsonObjectDeserializer<Dataset> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private DatasetService datasetService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param datasetService
     * @param conversionService
     */
    @Autowired
    public DatasetDeserializer(@Lazy DatasetService datasetService, ConversionService conversionService) {
        this.datasetService = datasetService;
        this.conversionService = conversionService;
    }
}
