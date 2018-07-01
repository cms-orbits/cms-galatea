package com.jossemargt.cmsgalatea.service.api;
import com.jossemargt.cmsgalatea.model.ExecutionScenario;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ExecutionScenarioService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ExecutionScenario.class)
public interface ExecutionScenarioService extends EntityResolver<ExecutionScenario, Long>, ValidatorService<ExecutionScenario> {
}
