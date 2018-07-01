package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Contest;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import com.jossemargt.cmsgalatea.model.ContestFindByName;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = ContestRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Contest.class, finders = { @RooFinder(value = "findByName", returnType = Contest.class, formBean = ContestFindByName.class) })
public interface ContestRepository extends ReadOnlyRepository<Contest, Long>, ContestRepositoryCustom {
}
