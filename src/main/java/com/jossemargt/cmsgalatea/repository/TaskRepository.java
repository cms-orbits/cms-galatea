package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Task;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = TaskRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Task.class, finders = { @RooFinder(value = "findByName", returnType = Task.class) })
public interface TaskRepository extends ReadOnlyRepository<Task, Long>, TaskRepositoryCustom {
}
