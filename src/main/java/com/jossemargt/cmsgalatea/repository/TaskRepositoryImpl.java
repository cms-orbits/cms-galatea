package com.jossemargt.cmsgalatea.repository;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.Task;
import com.jossemargt.cmsgalatea.model.Contest;
import com.jossemargt.cmsgalatea.model.QTask;
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
 * = TaskRepositoryImpl
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskRepositoryCustom.class)
@Transactional(readOnly = true)
public class TaskRepositoryImpl extends QueryDslRepositorySupportExt<Task> implements TaskRepositoryCustom {

    /**
     * Default constructor
     */
    TaskRepositoryImpl() {
        super(Task.class);
    }

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String MIN_SUBMISSION_INTERVAL = "minSubmissionInterval";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String SCORE_MODE = "scoreMode";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ACTIVE_DATASET = "activeDataset";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String NUM = "num";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TOKEN_GEN_INTERVAL = "tokenGenInterval";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String SCORE_PRECISION = "scorePrecision";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String NAME = "name";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TOKEN_MIN_INTERVAL = "tokenMinInterval";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String CONTEST = "contest";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TOKEN_GEN_INITIAL = "tokenGenInitial";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String PRIMARY_STATEMENTS = "primaryStatements";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String MAX_SUBMISSION_NUMBER = "maxSubmissionNumber";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TITLE = "title";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TOKEN_GEN_MAX = "tokenGenMax";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TOKEN_MAX_NUMBER = "tokenMaxNumber";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String MAX_USER_TEST_NUMBER = "maxUserTestNumber";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TOKEN_GEN_NUMBER = "tokenGenNumber";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TOKEN_MODE = "tokenMode";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String MIN_USER_TEST_INTERVAL = "minUserTestInterval";

    /**
     * TODO Auto-generated method documentation
     *
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Task> findAll(GlobalSearch globalSearch, Pageable pageable) {
        QTask task = QTask.task;
        JPQLQuery<Task> query = from(task);
        Path<?>[] paths = new Path<?>[] { task.num, task.name, task.title, task.primaryStatements, task.tokenMode, task.tokenMaxNumber, task.tokenMinInterval, task.tokenGenInitial, task.tokenGenNumber, task.tokenGenMax, task.tokenGenInterval, task.maxSubmissionNumber, task.maxUserTestNumber, task.minSubmissionInterval, task.minUserTestInterval, task.scorePrecision, task.scoreMode, task.contest, task.activeDataset };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(NUM, task.num).map(NAME, task.name).map(TITLE, task.title).map(PRIMARY_STATEMENTS, task.primaryStatements).map(TOKEN_MODE, task.tokenMode).map(TOKEN_MAX_NUMBER, task.tokenMaxNumber).map(TOKEN_MIN_INTERVAL, task.tokenMinInterval).map(TOKEN_GEN_INITIAL, task.tokenGenInitial).map(TOKEN_GEN_NUMBER, task.tokenGenNumber).map(TOKEN_GEN_MAX, task.tokenGenMax).map(TOKEN_GEN_INTERVAL, task.tokenGenInterval).map(MAX_SUBMISSION_NUMBER, task.maxSubmissionNumber).map(MAX_USER_TEST_NUMBER, task.maxUserTestNumber).map(MIN_SUBMISSION_INTERVAL, task.minSubmissionInterval).map(MIN_USER_TEST_INTERVAL, task.minUserTestInterval).map(SCORE_PRECISION, task.scorePrecision).map(SCORE_MODE, task.scoreMode).map(CONTEST, task.contest).map(ACTIVE_DATASET, task.activeDataset);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, task);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Task> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        QTask task = QTask.task;
        JPQLQuery<Task> query = from(task);
        Path<?>[] paths = new Path<?>[] { task.num, task.name, task.title, task.primaryStatements, task.tokenMode, task.tokenMaxNumber, task.tokenMinInterval, task.tokenGenInitial, task.tokenGenNumber, task.tokenGenMax, task.tokenGenInterval, task.maxSubmissionNumber, task.maxUserTestNumber, task.minSubmissionInterval, task.minUserTestInterval, task.scorePrecision, task.scoreMode, task.contest, task.activeDataset };
        applyGlobalSearch(globalSearch, query, paths);
        // Also, filter by the provided ids
        query.where(task.id.in(ids));
        AttributeMappingBuilder mapping = buildMapper().map(NUM, task.num).map(NAME, task.name).map(TITLE, task.title).map(PRIMARY_STATEMENTS, task.primaryStatements).map(TOKEN_MODE, task.tokenMode).map(TOKEN_MAX_NUMBER, task.tokenMaxNumber).map(TOKEN_MIN_INTERVAL, task.tokenMinInterval).map(TOKEN_GEN_INITIAL, task.tokenGenInitial).map(TOKEN_GEN_NUMBER, task.tokenGenNumber).map(TOKEN_GEN_MAX, task.tokenGenMax).map(TOKEN_GEN_INTERVAL, task.tokenGenInterval).map(MAX_SUBMISSION_NUMBER, task.maxSubmissionNumber).map(MAX_USER_TEST_NUMBER, task.maxUserTestNumber).map(MIN_SUBMISSION_INTERVAL, task.minSubmissionInterval).map(MIN_USER_TEST_INTERVAL, task.minUserTestInterval).map(SCORE_PRECISION, task.scorePrecision).map(SCORE_MODE, task.scoreMode).map(CONTEST, task.contest).map(ACTIVE_DATASET, task.activeDataset);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, task);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contest
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Task> findByContest(Contest contest, GlobalSearch globalSearch, Pageable pageable) {
        QTask task = QTask.task;
        JPQLQuery<Task> query = from(task);
        Assert.notNull(contest, "contest is required");
        query.where(task.contest.eq(contest));
        Path<?>[] paths = new Path<?>[] { task.num, task.name, task.title, task.primaryStatements, task.tokenMode, task.tokenMaxNumber, task.tokenMinInterval, task.tokenGenInitial, task.tokenGenNumber, task.tokenGenMax, task.tokenGenInterval, task.maxSubmissionNumber, task.maxUserTestNumber, task.minSubmissionInterval, task.minUserTestInterval, task.scorePrecision, task.scoreMode, task.contest, task.activeDataset };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(NUM, task.num).map(NAME, task.name).map(TITLE, task.title).map(PRIMARY_STATEMENTS, task.primaryStatements).map(TOKEN_MODE, task.tokenMode).map(TOKEN_MAX_NUMBER, task.tokenMaxNumber).map(TOKEN_MIN_INTERVAL, task.tokenMinInterval).map(TOKEN_GEN_INITIAL, task.tokenGenInitial).map(TOKEN_GEN_NUMBER, task.tokenGenNumber).map(TOKEN_GEN_MAX, task.tokenGenMax).map(TOKEN_GEN_INTERVAL, task.tokenGenInterval).map(MAX_SUBMISSION_NUMBER, task.maxSubmissionNumber).map(MAX_USER_TEST_NUMBER, task.maxUserTestNumber).map(MIN_SUBMISSION_INTERVAL, task.minSubmissionInterval).map(MIN_USER_TEST_INTERVAL, task.minUserTestInterval).map(SCORE_PRECISION, task.scorePrecision).map(SCORE_MODE, task.scoreMode).map(CONTEST, task.contest).map(ACTIVE_DATASET, task.activeDataset);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, task);
    }
}
