package com.jossemargt.cmsgalatea.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.Dataset;

/**
 * = DatasetRepositoryImpl
 *
 * Implementation of DatasetRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = DatasetRepositoryCustom.class)
public class DatasetRepositoryImpl extends QueryDslRepositorySupportExt<Dataset> implements DatasetRepositoryCustom{

    /**
     * Default constructor
     */
    DatasetRepositoryImpl() {
        super(Dataset.class);
    }
}