package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Task;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import com.jossemargt.cmsgalatea.service.api.TaskService;
import io.springlets.data.domain.GlobalSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

/**
 * = TasksCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Task.class, pathPrefix = "/galatea/v1/", type = ControllerType.COLLECTION)
@RooJSON
@RestController
@RequestMapping(value = "/galatea/v1/tasks", name = "TasksCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE)
public class TasksCollectionJsonController {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskService taskService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskService
     */
    @Autowired
    public TasksCollectionJsonController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return TaskService
     */
    public TaskService getTaskService() {
        return taskService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param taskService
     */
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<Task>> list(GlobalSearch globalSearch, Pageable pageable) {
        Page<Task> tasks = getTaskService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(tasks);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return UriComponents
     */
    public static UriComponents listURI() {
        return MvcUriComponentsBuilder.fromMethodCall(MvcUriComponentsBuilder.on(TasksCollectionJsonController.class).list(null, null)).build().encode();
    }
}
