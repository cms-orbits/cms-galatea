package com.jossemargt.cmsgalatea.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;

/**
 * = SubmissionFormatElementRepositoryImpl
 *
 * Implementation of SubmissionFormatElementRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = SubmissionFormatElementRepositoryCustom.class)
public class SubmissionFormatElementRepositoryImpl extends QueryDslRepositorySupportExt<SubmissionFormatElement> implements SubmissionFormatElementRepositoryCustom{

    /**
     * Default constructor
     */
    SubmissionFormatElementRepositoryImpl() {
        super(SubmissionFormatElement.class);
    }
}