package com.jossemargt.cmsgalatea.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.ExecutionScenario;

/**
 * = ExecutionScenarioRepositoryImpl
 *
 * Implementation of ExecutionScenarioRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ExecutionScenarioRepositoryCustom.class)
public class ExecutionScenarioRepositoryImpl extends QueryDslRepositorySupportExt<ExecutionScenario> implements ExecutionScenarioRepositoryCustom{

    /**
     * Default constructor
     */
    ExecutionScenarioRepositoryImpl() {
        super(ExecutionScenario.class);
    }
}