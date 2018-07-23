package com.jossemargt.cmsgalatea.repository;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.Dataset;
import com.jossemargt.cmsgalatea.model.DatasetInfo;
import com.jossemargt.cmsgalatea.model.QDataset;
import com.jossemargt.cmsgalatea.model.Task;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = DatasetRepositoryImpl
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustomImpl(repository = DatasetRepositoryCustom.class)
@Transactional(readOnly = true)
public class DatasetRepositoryImpl extends QueryDslRepositorySupportExt<Dataset> implements DatasetRepositoryCustom {

    /**
     * Default constructor
     */
    DatasetRepositoryImpl() {
        super(Dataset.class);
    }

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String AUTOJUDGE = "autojudge";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String SCORE_TYPE = "scoreType";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TASK = "task";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String DESCRIPTION = "description";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TASK_TYPE = "taskType";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TASK_TYPE_PARAMETERS = "taskTypeParameters";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TIME_LIMIT = "timeLimit";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String SCORE_TYPE_PARAMETERS = "scoreTypeParameters";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ID = "id";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String MEMORY_LIMIT = "memoryLimit";

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<DatasetInfo> findAll(GlobalSearch globalSearch, Pageable pageable) {
        QDataset dataset = QDataset.dataset;
        JPQLQuery<Dataset> query = from(dataset);
        Path<?>[] paths = new Path<?>[] { dataset.id, dataset.description, dataset.timeLimit, dataset.memoryLimit, dataset.taskType, dataset.scoreType };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(ID, dataset.id).map(DESCRIPTION, dataset.description).map(TIME_LIMIT, dataset.timeLimit).map(MEMORY_LIMIT, dataset.memoryLimit).map(TASK_TYPE, dataset.taskType).map(SCORE_TYPE, dataset.scoreType);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, Projections.constructor(DatasetInfo.class, dataset.id, dataset.description, dataset.timeLimit, dataset.memoryLimit, dataset.taskType, dataset.scoreType));
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<DatasetInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        QDataset dataset = QDataset.dataset;
        JPQLQuery<Dataset> query = from(dataset);
        Path<?>[] paths = new Path<?>[] { dataset.id, dataset.description, dataset.timeLimit, dataset.memoryLimit, dataset.taskType, dataset.scoreType };
        applyGlobalSearch(globalSearch, query, paths);
        // Also, filter by the provided ids
        query.where(dataset.id.in(ids));
        AttributeMappingBuilder mapping = buildMapper().map(ID, dataset.id).map(DESCRIPTION, dataset.description).map(TIME_LIMIT, dataset.timeLimit).map(MEMORY_LIMIT, dataset.memoryLimit).map(TASK_TYPE, dataset.taskType).map(SCORE_TYPE, dataset.scoreType);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, Projections.constructor(DatasetInfo.class, dataset.id, dataset.description, dataset.timeLimit, dataset.memoryLimit, dataset.taskType, dataset.scoreType));
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param task
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<DatasetInfo> findByTask(Task task, GlobalSearch globalSearch, Pageable pageable) {
        QDataset dataset = QDataset.dataset;
        JPQLQuery<Dataset> query = from(dataset);
        Assert.notNull(task, "task is required");
        query.where(dataset.task.eq(task));
        Path<?>[] paths = new Path<?>[] { dataset.id, dataset.description, dataset.timeLimit, dataset.memoryLimit, dataset.taskType, dataset.scoreType };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(ID, dataset.id).map(DESCRIPTION, dataset.description).map(TIME_LIMIT, dataset.timeLimit).map(MEMORY_LIMIT, dataset.memoryLimit).map(TASK_TYPE, dataset.taskType).map(SCORE_TYPE, dataset.scoreType);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, Projections.constructor(DatasetInfo.class, dataset.id, dataset.description, dataset.timeLimit, dataset.memoryLimit, dataset.taskType, dataset.scoreType));
    }
}
