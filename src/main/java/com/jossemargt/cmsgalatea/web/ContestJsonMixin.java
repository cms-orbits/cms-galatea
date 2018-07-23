package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Contest;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooJsonMixin;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jossemargt.cmsgalatea.model.Task;
import java.util.Set;

/**
 * = ContestJsonMixin
 TODO Auto-generated class documentation
 *
 */
@RooJsonMixin(entity = Contest.class)
public abstract class ContestJsonMixin {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonIgnore
    private Set<Task> tasks;

    /**
     * TODO Auto-generated method documentation
     *
     * @return Set
     */
    public Set<Task> getTasks() {
        return tasks;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param tasks
     */
    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
