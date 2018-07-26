package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Task;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import org.springframework.util.MultiValueMap;

import com.jossemargt.cmsgalatea.service.api.TaskService;
import io.springlets.web.NotFoundException;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

/**
 * = TasksItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Task.class, pathPrefix = "/galatea/v1/", type = ControllerType.ITEM)
@RooJSON
@RestController
@RequestMapping(value = "/galatea/v1/tasks/{task}", name = "TasksItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE)
public class TasksItemJsonController {

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
    public TasksItemJsonController(TaskService taskService) {
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
     * @param id
     * @return Task
     */
    @ModelAttribute
    public Task getTask(@PathVariable("task") Long id, 
			@RequestParam MultiValueMap<String, String> multiMap) {
    	String lang = "";
    	Task task = null;
    	
    	if(multiMap.get("lang") != null) {
    		lang = multiMap.get("lang").get(0);
    		task = getTaskService().findTaskByIdAndLang(id, lang);        	
    	}else {
    		task = getTaskService().findOne(id);
    	}
    	
   
        
        if (task == null) {
            throw new NotFoundException(String.format("Task with identifier '%s' not found", id));
        }
        return task;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> show(@ModelAttribute Task task) {
        return ResponseEntity.ok(task);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return UriComponents
     */
    public static UriComponents showURI(Task task) {
        return MvcUriComponentsBuilder.fromMethodCall(MvcUriComponentsBuilder.on(TasksItemJsonController.class).show(task)).buildAndExpand(task.getId()).encode();
    }
}
