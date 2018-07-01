package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Task;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import com.jossemargt.cmsgalatea.model.TaskFindByTitleWithContent;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = TaskRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Task.class, finders = { @RooFinder(value = "findByTitle", returnType = Task.class, formBean = TaskFindByTitleWithContent.class) })
public interface TaskRepository extends ReadOnlyRepository<Task, Long>, TaskRepositoryCustom {
}
