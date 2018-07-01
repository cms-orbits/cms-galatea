package com.jossemargt.cmsgalatea.service.api;
import com.jossemargt.cmsgalatea.model.Contest;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ContestService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Contest.class)
public interface ContestService extends EntityResolver<Contest, Long>, ValidatorService<Contest> {
}
