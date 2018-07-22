package com.jossemargt.cmsgalatea.service.impl;
import com.jossemargt.cmsgalatea.service.api.StatementService;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import com.jossemargt.cmsgalatea.model.Statement;
import com.jossemargt.cmsgalatea.model.Task;
import com.jossemargt.cmsgalatea.repository.StatementRepository;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * = StatementServiceImpl
 TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = StatementService.class)
@Service
@Transactional(readOnly = true)
public class StatementServiceImpl implements StatementService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private StatementRepository statementRepository;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param statementRepository
     */
    @Autowired
    public StatementServiceImpl(StatementRepository statementRepository) {
        setStatementRepository(statementRepository);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return StatementRepository
     */
    public StatementRepository getStatementRepository() {
        return statementRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param statementRepository
     */
    public void setStatementRepository(StatementRepository statementRepository) {
        this.statementRepository = statementRepository;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param statement
     * @return Map
     */
    public Map<String, List<MessageI18n>> validate(Statement statement) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        return messages;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Statement
     */
    public Statement findOne(Long id) {
        return getStatementRepository().findOne(id);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @return List
     */
    public List<Statement> findAll(Iterable<Long> ids) {
        return getStatementRepository().findAll(ids);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Statement> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable) {
        return getStatementRepository().findByTask(task, globalSearch, pageable);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @return Long
     */
    public long countByTask(Task task) {
        return getStatementRepository().countByTask(task);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Statement> getEntityType() {
        return Statement.class;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Class
     */
    public Class<Long> getIdType() {
        return Long.class;
    }
}
