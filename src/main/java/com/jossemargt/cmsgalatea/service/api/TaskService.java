package com.jossemargt.cmsgalatea.service.api;
import com.jossemargt.cmsgalatea.model.Task;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import com.jossemargt.cmsgalatea.model.Contest;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TaskService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Task.class)
public interface TaskService extends EntityResolver<Task, Long>, ValidatorService<Task> {

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Task
     */
    public abstract Task findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public abstract List<Task> findAll(Iterable<Long> ids);

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public abstract List<Task> findAll();

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    public abstract long count();

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Task> findAll(GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Task> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);

    /**
     * TODO Auto-generated method documentation
     *
     * @param contest
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Task> findByContest(Contest contest, GlobalSearch globalSearch, Pageable pageable);

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
