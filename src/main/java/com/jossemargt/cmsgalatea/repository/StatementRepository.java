package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.model.Statement;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import com.jossemargt.cmsgalatea.model.Task;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 * = StatementRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Statement.class)
@Transactional(readOnly = true)
public interface StatementRepository extends ReadOnlyRepository<Statement, Long>, StatementRepositoryCustom {

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return Long
     */
    public abstract long countByTask(Task task);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Statement
     */
    public abstract Statement findOne(Long id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return List
     */
    public abstract List<Statement> findAll(Iterable<Long> id);

    /**
     * TODO Auto-generated method documentation
     *
     * @param statement
     * @return Statement
     */
    public abstract Statement save(Statement statement);
}
