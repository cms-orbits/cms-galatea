package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = SubmissionFormatElementRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = SubmissionFormatElement.class)
public interface SubmissionFormatElementRepository extends ReadOnlyRepository<SubmissionFormatElement, Long>, SubmissionFormatElementRepositoryCustom {
}
