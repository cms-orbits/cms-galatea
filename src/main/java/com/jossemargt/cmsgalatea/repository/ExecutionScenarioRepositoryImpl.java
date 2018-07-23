package com.jossemargt.cmsgalatea.repository;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.ExecutionScenario;
import com.jossemargt.cmsgalatea.model.Dataset;
import com.jossemargt.cmsgalatea.model.QExecutionScenario;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = ExecutionScenarioRepositoryImpl
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustomImpl(repository = ExecutionScenarioRepositoryCustom.class)
@Transactional(readOnly = true)
public class ExecutionScenarioRepositoryImpl extends QueryDslRepositorySupportExt<ExecutionScenario> implements ExecutionScenarioRepositoryCustom {

    /**
     * Default constructor
     */
    ExecutionScenarioRepositoryImpl() {
        super(ExecutionScenario.class);
    }

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String QUERYABLE = "queryable";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String DATASET = "dataset";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String INPUT_FILES_DIGEST = "inputFilesDigest";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String OUTPUT_FILES_DIGEST = "outputFilesDigest";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String CODENAME = "codename";

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ExecutionScenario> findAll(GlobalSearch globalSearch, Pageable pageable) {
        QExecutionScenario executionScenario = QExecutionScenario.executionScenario;
        JPQLQuery<ExecutionScenario> query = from(executionScenario);
        Path<?>[] paths = new Path<?>[] { executionScenario.codename, executionScenario.queryable, executionScenario.inputFilesDigest, executionScenario.outputFilesDigest, executionScenario.dataset };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(CODENAME, executionScenario.codename).map(QUERYABLE, executionScenario.queryable).map(INPUT_FILES_DIGEST, executionScenario.inputFilesDigest).map(OUTPUT_FILES_DIGEST, executionScenario.outputFilesDigest).map(DATASET, executionScenario.dataset);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, executionScenario);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ExecutionScenario> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        QExecutionScenario executionScenario = QExecutionScenario.executionScenario;
        JPQLQuery<ExecutionScenario> query = from(executionScenario);
        Path<?>[] paths = new Path<?>[] { executionScenario.codename, executionScenario.queryable, executionScenario.inputFilesDigest, executionScenario.outputFilesDigest, executionScenario.dataset };
        applyGlobalSearch(globalSearch, query, paths);
        // Also, filter by the provided ids
        query.where(executionScenario.id.in(ids));
        AttributeMappingBuilder mapping = buildMapper().map(CODENAME, executionScenario.codename).map(QUERYABLE, executionScenario.queryable).map(INPUT_FILES_DIGEST, executionScenario.inputFilesDigest).map(OUTPUT_FILES_DIGEST, executionScenario.outputFilesDigest).map(DATASET, executionScenario.dataset);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, executionScenario);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param dataset
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ExecutionScenario> findByDataset(Dataset dataset, GlobalSearch globalSearch, Pageable pageable) {
        QExecutionScenario executionScenario = QExecutionScenario.executionScenario;
        JPQLQuery<ExecutionScenario> query = from(executionScenario);
        Assert.notNull(dataset, "dataset is required");
        query.where(executionScenario.dataset.eq(dataset));
        Path<?>[] paths = new Path<?>[] { executionScenario.codename, executionScenario.queryable, executionScenario.inputFilesDigest, executionScenario.outputFilesDigest, executionScenario.dataset };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(CODENAME, executionScenario.codename).map(QUERYABLE, executionScenario.queryable).map(INPUT_FILES_DIGEST, executionScenario.inputFilesDigest).map(OUTPUT_FILES_DIGEST, executionScenario.outputFilesDigest).map(DATASET, executionScenario.dataset);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, executionScenario);
    }
}
