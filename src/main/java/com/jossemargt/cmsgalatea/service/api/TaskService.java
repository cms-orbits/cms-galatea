package com.jossemargt.cmsgalatea.service.api;
import com.jossemargt.cmsgalatea.model.Task;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = TaskService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Task.class)
public interface TaskService extends EntityResolver<Task, Long>, ValidatorService<Task> {
}
