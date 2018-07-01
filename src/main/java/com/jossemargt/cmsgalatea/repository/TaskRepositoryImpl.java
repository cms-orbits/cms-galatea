package com.jossemargt.cmsgalatea.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.Task;

/**
 * = TaskRepositoryImpl
 *
 * Implementation of TaskRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskRepositoryCustom.class)
public class TaskRepositoryImpl extends QueryDslRepositorySupportExt<Task> implements TaskRepositoryCustom{

    /**
     * Default constructor
     */
    TaskRepositoryImpl() {
        super(Task.class);
    }
}