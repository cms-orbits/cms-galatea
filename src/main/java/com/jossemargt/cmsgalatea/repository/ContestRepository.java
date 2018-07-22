package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Contest;
import com.jossemargt.cmsgalatea.model.ContestInfo;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import com.jossemargt.cmsgalatea.model.ContestByName;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = ContestRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Contest.class, defaultReturnType = ContestInfo.class, finders = { @RooFinder(value = "findByName", returnType = ContestInfo.class, formBean = ContestByName.class) })
public interface ContestRepository extends ReadOnlyRepository<Contest, Long>, ContestRepositoryCustom {
}
