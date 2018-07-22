package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Task;
import com.jossemargt.cmsgalatea.service.api.TaskService;
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
 * = TaskDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Task.class)
@JsonComponent
public class TaskDeserializer extends JsonObjectDeserializer<Task> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskService taskService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskService
     * @param conversionService
     */
    @Autowired
    public TaskDeserializer(@Lazy TaskService taskService, ConversionService conversionService) {
        this.taskService = taskService;
        this.conversionService = conversionService;
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
     * @return Task
     */
    public Task deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        Task task = taskService.findOne(id);
        if (task == null) {
            throw new NotFoundException("Task not found");
        }
        return task;
    }
}
