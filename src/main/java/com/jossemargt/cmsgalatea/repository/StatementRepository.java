package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Statement;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = StatementRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Statement.class)
public interface StatementRepository extends ReadOnlyRepository<Statement, Long>, StatementRepositoryCustom {
}
