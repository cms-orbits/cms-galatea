package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Dataset;
import com.jossemargt.cmsgalatea.service.api.DatasetService;
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
 * = DatasetDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Dataset.class)
@JsonComponent
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

    /**
     * TODO Auto-generated method documentation
     *
     * @return DatasetService
     */
    public DatasetService getDatasetService() {
        return datasetService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param datasetService
     */
    public void setDatasetService(DatasetService datasetService) {
        this.datasetService = datasetService;
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
     * @return Dataset
     */
    public Dataset deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        Dataset dataset = datasetService.findOne(id);
        if (dataset == null) {
            throw new NotFoundException("Dataset not found");
        }
        return dataset;
    }
}
