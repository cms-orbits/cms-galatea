package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Task;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TasksItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Task.class, pathPrefix = "/galatea/v1/", type = ControllerType.ITEM)
@RooJSON
public class TasksItemJsonController {
}
