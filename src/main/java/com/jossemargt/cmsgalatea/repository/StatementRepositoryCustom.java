package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Statement;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustom;
import com.jossemargt.cmsgalatea.model.Task;
import io.springlets.data.domain.GlobalSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = StatementRepositoryCustom
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustom(entity = Statement.class)
public interface StatementRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<Statement> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable);
}
