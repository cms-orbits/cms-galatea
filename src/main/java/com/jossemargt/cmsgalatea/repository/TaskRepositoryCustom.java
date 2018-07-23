package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Task;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustom;
import com.jossemargt.cmsgalatea.model.Contest;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TaskRepositoryCustom
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustom(entity = Task.class)
public interface TaskRepositoryCustom {

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
}
