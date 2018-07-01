package com.jossemargt.cmsgalatea.service.api;
import com.jossemargt.cmsgalatea.model.Statement;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = StatementService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Statement.class)
public interface StatementService extends EntityResolver<Statement, Long>, ValidatorService<Statement> {
}
