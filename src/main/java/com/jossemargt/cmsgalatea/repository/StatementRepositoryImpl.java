package com.jossemargt.cmsgalatea.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.Statement;

/**
 * = StatementRepositoryImpl
 *
 * Implementation of StatementRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = StatementRepositoryCustom.class)
public class StatementRepositoryImpl extends QueryDslRepositorySupportExt<Statement> implements StatementRepositoryCustom{

    /**
     * Default constructor
     */
    StatementRepositoryImpl() {
        super(Statement.class);
    }
}