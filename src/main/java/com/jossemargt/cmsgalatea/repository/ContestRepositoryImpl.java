package com.jossemargt.cmsgalatea.repository;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jossemargt.cmsgalatea.model.Contest;
import com.jossemargt.cmsgalatea.model.ContestByName;
import com.jossemargt.cmsgalatea.model.ContestInfo;
import com.jossemargt.cmsgalatea.model.QContest;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ContestRepositoryImpl
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryCustomImpl(repository = ContestRepositoryCustom.class)
@Transactional(readOnly = true)
public class ContestRepositoryImpl extends QueryDslRepositorySupportExt<Contest> implements ContestRepositoryCustom {

    /**
     * Default constructor
     */
    ContestRepositoryImpl() {
        super(Contest.class);
    }

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String START_TIME = "startTime";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ALLOW_QUESTIONS = "allowQuestions";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String IP_AUTOLOGIN = "ipAutologin";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String DESCRIPTION = "description";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String SUBMISSIONS_DOWNLOAD_ALLOWED = "submissionsDownloadAllowed";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TOKEN_GEN_INITIAL = "tokenGenInitial";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ALLOWED_LOCALIZATIONS = "allowedLocalizations";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String BLOCK_HIDDEN_PARTICIPATIONS = "blockHiddenParticipations";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String MAX_SUBMISSION_NUMBER = "maxSubmissionNumber";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TOKEN_GEN_MAX = "tokenGenMax";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ID = "id";

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
    public static final String MIN_SUBMISSION_INTERVAL = "minSubmissionInterval";

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
    public static final String LANGUAGES = "languages";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ALLOW_PASSWORD_AUTHENTICATION = "allowPasswordAuthentication";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String STOP_TIME = "stopTime";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String NAME = "name";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String IP_RESTRICTION = "ipRestriction";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ANALYSIS_ENABLED = "analysisEnabled";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ALLOW_USER_TESTS = "allowUserTests";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String TOKEN_MIN_INTERVAL = "tokenMinInterval";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ANALYSIS_START = "analysisStart";

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
    public static final String ANALYSIS_STOP = "analysisStop";

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
    public Page<ContestInfo> findAll(GlobalSearch globalSearch, Pageable pageable) {
        QContest contest = QContest.contest;
        JPQLQuery<Contest> query = from(contest);
        Path<?>[] paths = new Path<?>[] { contest.id, contest.name, contest.description, contest.languages, contest.startTime, contest.stopTime };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(ID, contest.id).map(NAME, contest.name).map(DESCRIPTION, contest.description).map(LANGUAGES, contest.languages).map(START_TIME, contest.startTime).map(STOP_TIME, contest.stopTime);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, Projections.constructor(ContestInfo.class, contest.id, contest.name, contest.description, contest.languages, contest.startTime, contest.stopTime));
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ContestInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        QContest contest = QContest.contest;
        JPQLQuery<Contest> query = from(contest);
        Path<?>[] paths = new Path<?>[] { contest.id, contest.name, contest.description, contest.languages, contest.startTime, contest.stopTime };
        applyGlobalSearch(globalSearch, query, paths);
        // Also, filter by the provided ids
        query.where(contest.id.in(ids));
        AttributeMappingBuilder mapping = buildMapper().map(ID, contest.id).map(NAME, contest.name).map(DESCRIPTION, contest.description).map(LANGUAGES, contest.languages).map(START_TIME, contest.startTime).map(STOP_TIME, contest.stopTime);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, Projections.constructor(ContestInfo.class, contest.id, contest.name, contest.description, contest.languages, contest.startTime, contest.stopTime));
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param formBean
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<ContestInfo> findByName(ContestByName formBean, GlobalSearch globalSearch, Pageable pageable) {
        QContest contest = QContest.contest;
        JPQLQuery<Contest> query = from(contest);
        if (formBean != null) {
            BooleanBuilder searchCondition = new BooleanBuilder();
            if (formBean.getName() != null) {
                searchCondition.and(contest.name.eq(formBean.getName()));
            }
            if (searchCondition.hasValue()) {
                query.where(searchCondition);
            }
        }
        Path<?>[] paths = new Path<?>[] { contest.id, contest.name, contest.description, contest.languages, contest.startTime, contest.stopTime };
        applyGlobalSearch(globalSearch, query, paths);
        AttributeMappingBuilder mapping = buildMapper().map(ID, contest.id).map(NAME, contest.name).map(DESCRIPTION, contest.description).map(LANGUAGES, contest.languages).map(START_TIME, contest.startTime).map(STOP_TIME, contest.stopTime);
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        return loadPage(query, pageable, Projections.constructor(ContestInfo.class, contest.id, contest.name, contest.description, contest.languages, contest.startTime, contest.stopTime));
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param formBean
     * @return Long
     */
    public long countByName(ContestByName formBean) {
        QContest contest = QContest.contest;
        JPQLQuery<Contest> query = from(contest);
        BooleanBuilder searchCondition = new BooleanBuilder();
        if (formBean.getName() != null) {
            searchCondition.and(contest.name.eq(formBean.getName()));
        }
        if (searchCondition.hasValue()) {
            query.where(searchCondition);
        }
        return query.fetchCount();
    }
}
