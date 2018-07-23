package com.jossemargt.cmsgalatea.repository;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.Statement;
import com.jossemargt.cmsgalatea.model.QStatement;
import com.jossemargt.cmsgalatea.model.Task;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = StatementRepositoryImpl
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustomImpl(repository = StatementRepositoryCustom.class)
@Transactional(readOnly = true)
public class StatementRepositoryImpl extends QueryDslRepositorySupportExt<Statement> implements StatementRepositoryCustom {

    /**
     * Default constructor
     */
    StatementRepositoryImpl() {
        super(Statement.class);
    }

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String LANGUAGE = "language";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TASK = "task";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String CONTENT = "content";

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Statement> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable) {
        QStatement statement = QStatement.statement;
        JPQLQuery<Statement> query = from(statement);
        Assert.notNull(task, "task is required");
        query.where(statement.task.eq(task));
        Path<?>[] paths = new Path<?>[] { statement.language, statement.content, statement.task };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(LANGUAGE, statement.language).map(CONTENT, statement.content).map(TASK, statement.task);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, statement);
    }
}
