package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.ExecutionScenario;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ExecutionScenarioRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ExecutionScenario.class)
public interface ExecutionScenarioRepository extends ReadOnlyRepository<ExecutionScenario, Long>, ExecutionScenarioRepositoryCustom {
}
