package com.jossemargt.cmsgalatea.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.Contest;

/**
 * = ContestRepositoryImpl
 *
 * Implementation of ContestRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ContestRepositoryCustom.class)
public class ContestRepositoryImpl extends QueryDslRepositorySupportExt<Contest> implements ContestRepositoryCustom{

    /**
     * Default constructor
     */
    ContestRepositoryImpl() {
        super(Contest.class);
    }
}