package com.jossemargt.cmsgalatea.config.jackson;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDomainModelModule;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.jossemargt.cmsgalatea.model.Contest;
import com.jossemargt.cmsgalatea.model.Task;
import com.jossemargt.cmsgalatea.web.ContestJsonMixin;
import com.jossemargt.cmsgalatea.web.TaskJsonMixin;
import org.springframework.boot.jackson.JsonComponent;

/**
 * = DomainModelModule
 TODO Auto-generated class documentation
 *
 */
@RooDomainModelModule
@JsonComponent
public class DomainModelModule extends SimpleModule {

    /**
     * TODO Auto-generated constructor documentation
     *
     */
    public DomainModelModule() {
        // Mixin registration
        setMixInAnnotation(Contest.class, ContestJsonMixin.class);
        setMixInAnnotation(Task.class, TaskJsonMixin.class);
    }
}
