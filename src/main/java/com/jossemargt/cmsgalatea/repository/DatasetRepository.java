package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Dataset;
import com.jossemargt.cmsgalatea.model.DatasetInfo;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = DatasetRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Dataset.class, defaultReturnType = DatasetInfo.class)
public interface DatasetRepository extends ReadOnlyRepository<Dataset, Long>, DatasetRepositoryCustom {
}
