package com.jossemargt.cmsgalatea.service.api;
import com.jossemargt.cmsgalatea.model.Dataset;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = DatasetService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Dataset.class)
public interface DatasetService extends EntityResolver<Dataset, Long>, ValidatorService<Dataset> {
}
