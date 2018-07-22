package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Task;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;
import com.jossemargt.cmsgalatea.model.Contest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Task.class, finders = { @RooFinder(value = "findByName", returnType = Task.class) })
@Transactional(readOnly = true)
public interface TaskRepository extends ReadOnlyRepository<Task, Long>, TaskRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param contest
     * @return Long
     */
    public abstract long countByContest(Contest contest);

    /**
     * TODO Auto-generated method documentation
     *
     * @param name
     * @param pageable
     * @return Page
     */
    public abstract Page<Task> findByName(String name, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param name
     * @return Long
     */
    public abstract long countByName(String name);
}
