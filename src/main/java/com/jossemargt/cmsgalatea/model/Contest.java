package com.jossemargt.cmsgalatea.model;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.validation.constraints.Min;
import org.springframework.format.annotation.NumberFormat;
import java.time.LocalTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import io.springlets.format.EntityFormat;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * = Contest
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooJpaEntity(table = "contests", readOnly = true)
@RooEquals(isJpaEntity = true)
@Entity
@Table(name = "contests")
@EntityFormat
public class Contest {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Version
    @Transient
    private Integer version;

    /**
     * Short human readable name AKA slug
     */
    @NotNull
    @Column(unique = true)
    private String name;

    /**
     * Human readable description
     */
    @NotNull
    private String description;

    /**
     * Comma separated allowed locations to participate
     */
    @NotNull
    @Value("")
    @Column(name = "allowed_localizations")
    private String allowedLocalizations;

    /**
     * Comma separated allowed languages.
     */
    @NotNull
    @Value("Java / JDK,C# / Mono,Python 2 / CPython,Python 3 / CPython")
    @Column(name = "languages")
    private String languages;

    /**
     * Whether contestants allowed to download their submissions.
     */
    @NotNull
    @Value("true")
    @Column(name = "submissions_download_allowed")
    private Boolean submissionsDownloadAllowed;

    /**
     * Whether the user question is enabled.
     */
    @NotNull
    @Value("true")
    @Column(name = "allow_questions")
    private Boolean allowQuestions;

    /**
     * Whether the user test interface is enabled.
     */
    @NotNull
    @Value("true")
    @Column(name = "allow_user_tests")
    private Boolean allowUserTests;

    /**
     * Whether to prevent hidden participations to log in.
     */
    @NotNull
    @Value("false")
    @Column(name = "block_hidden_participations")
    private Boolean blockHiddenParticipations;

    /**
     * Whether to allow username/password authentication.
     */
    @NotNull
    @Value("true")
    @Column(name = "allow_password_authentication")
    private Boolean allowPasswordAuthentication;

    /**
     * Whether to enforce that the IP address of the request matches.
     */
    @NotNull
    @Value("true")
    @Column(name = "ip_restriction")
    private Boolean ipRestriction;

    /**
     * Whether to automatically log in users connecting from an IP.
     */
    @NotNull
    @Value("false")
    @Column(name = "ip_autologin")
    private Boolean ipAutologin;

    /**
     * The kind of token rules that will be active during the contest.
     */
    @NotNull
    @Column(name = "token_mode")
    @Enumerated(EnumType.STRING)
    private TokenMode tokenMode;

    /**
     * Maximum number of tokens (for finite mode only)
     */
    @Value("1")
    @Column(name = "token_max_number")
    @Min(1L)
    @NumberFormat
    private Integer tokenMaxNumber;

    /**
     * The minimum interval between two successive uses of tokens for the same user
     */
    @NotNull
    @Column(name = "token_min_interval")
    @DateTimeFormat(style = "-M")
    private LocalTime tokenMinInterval;

    /**
     * Initial token value (for finite mode only)
     */
    @NotNull
    @Value("2")
    @Column(name = "token_gen_initial")
    @Min(0L)
    @NumberFormat
    private Integer tokenGenInitial;

    /**
     * Incrementation token interval value (for finite mode only)
     */
    @NotNull
    @Value("2")
    @Column(name = "token_gen_number")
    @Min(0L)
    @NumberFormat
    private Integer tokenGenNumber;

    /**
     * Token limit (for finite mode only)
     */
    @NotNull
    @Value("1")
    @Column(name = "token_gen_max")
    @Min(1L)
    @NumberFormat
    private Integer tokenGenMax;

    /**
     * Token generation interval (for finite mode only)
     */
    @NotNull
    @Value("00:30:00")
    @Column(name = "token_gen_interval")
    @DateTimeFormat(style = "-M")
    private LocalTime tokenGenInterval;

    /**
     * Exact time when the contest will be available to interact with.
     */
    @NotNull
    @Column(name = "start")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Instant startTime;

    /**
     * Exact time when the contest will be unavailable to interact with.
     */
    @NotNull
    @Column(name = "stop")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Instant stopTime;

    /**
     * Toggles the contests into analysis mode.
     */
    @NotNull
    @Value("false")
    @Column(name = "analysis_enabled")
    private Boolean analysisEnabled;

    /**
     * Exact time when the contest will be in analysis mode.
     */
    @NotNull
    @Column(name = "analysis_start")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Instant analysisStart;

    /**
     * Exact time when the contest will finish the analysis mode.
     */
    @NotNull
    @Column(name = "analysis_stop")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Instant analysisStop;

    /**
     * Maximum number of submissions allowed per contest
     */
    @Value("1")
    @Column(name = "max_submission_number")
    @Min(1L)
    @NumberFormat
    private Integer maxSubmissionNumber;

    /**
     * Maximum number of user_tests allowed per contest
     */
    @Value("1")
    @Column(name = "max_user_test_number")
    @Min(1L)
    @NumberFormat
    private Integer maxUserTestNumber;

    /**
     * Minimum interval between two submission
     */
    @Value("00:00:01")
    @Column(name = "min_submission_interval")
    @DateTimeFormat(style = "-M")
    private LocalTime minSubmissionInterval;

    /**
     * Minimum interval between two user_test
     */
    @Value("00:00:01")
    @Column(name = "min_user_test_interval")
    @DateTimeFormat(style = "-M")
    private LocalTime minUserTestInterval;

    /**
     * Amount of decimals to be held and rounded up
     */
    @NotNull
    @Value("0")
    @Column(name = "score_precision")
    @Min(0L)
    @NumberFormat
    private Integer scorePrecision;

    /**
     * All the tasks assigned to this Contest
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "contest")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Task> tasks = new HashSet<Task>();

    /**
     * Gets id value
     *
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Gets version value
     *
     * @return Integer
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Gets name value
     *
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets description value
     *
     * @return String
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets allowedLocalizations value
     *
     * @return String
     */
    public String getAllowedLocalizations() {
        return this.allowedLocalizations;
    }

    /**
     * Gets languages value
     *
     * @return String
     */
    public String getLanguages() {
        return this.languages;
    }

    /**
     * Gets submissionsDownloadAllowed value
     *
     * @return Boolean
     */
    public Boolean getSubmissionsDownloadAllowed() {
        return this.submissionsDownloadAllowed;
    }

    /**
     * Gets allowQuestions value
     *
     * @return Boolean
     */
    public Boolean getAllowQuestions() {
        return this.allowQuestions;
    }

    /**
     * Gets allowUserTests value
     *
     * @return Boolean
     */
    public Boolean getAllowUserTests() {
        return this.allowUserTests;
    }

    /**
     * Gets blockHiddenParticipations value
     *
     * @return Boolean
     */
    public Boolean getBlockHiddenParticipations() {
        return this.blockHiddenParticipations;
    }

    /**
     * Gets allowPasswordAuthentication value
     *
     * @return Boolean
     */
    public Boolean getAllowPasswordAuthentication() {
        return this.allowPasswordAuthentication;
    }

    /**
     * Gets ipRestriction value
     *
     * @return Boolean
     */
    public Boolean getIpRestriction() {
        return this.ipRestriction;
    }

    /**
     * Gets ipAutologin value
     *
     * @return Boolean
     */
    public Boolean getIpAutologin() {
        return this.ipAutologin;
    }

    /**
     * Gets tokenMode value
     *
     * @return TokenMode
     */
    public TokenMode getTokenMode() {
        return this.tokenMode;
    }

    /**
     * Gets tokenMaxNumber value
     *
     * @return Integer
     */
    public Integer getTokenMaxNumber() {
        return this.tokenMaxNumber;
    }

    /**
     * Gets tokenMinInterval value
     *
     * @return LocalTime
     */
    public LocalTime getTokenMinInterval() {
        return this.tokenMinInterval;
    }

    /**
     * Gets tokenGenInitial value
     *
     * @return Integer
     */
    public Integer getTokenGenInitial() {
        return this.tokenGenInitial;
    }

    /**
     * Gets tokenGenNumber value
     *
     * @return Integer
     */
    public Integer getTokenGenNumber() {
        return this.tokenGenNumber;
    }

    /**
     * Gets tokenGenMax value
     *
     * @return Integer
     */
    public Integer getTokenGenMax() {
        return this.tokenGenMax;
    }

    /**
     * Gets tokenGenInterval value
     *
     * @return LocalTime
     */
    public LocalTime getTokenGenInterval() {
        return this.tokenGenInterval;
    }

    /**
     * Gets startTime value
     *
     * @return Instant
     */
    public Instant getStartTime() {
        return this.startTime;
    }

    /**
     * Gets stopTime value
     *
     * @return Instant
     */
    public Instant getStopTime() {
        return this.stopTime;
    }

    /**
     * Gets analysisEnabled value
     *
     * @return Boolean
     */
    public Boolean getAnalysisEnabled() {
        return this.analysisEnabled;
    }

    /**
     * Gets analysisStart value
     *
     * @return Instant
     */
    public Instant getAnalysisStart() {
        return this.analysisStart;
    }

    /**
     * Gets analysisStop value
     *
     * @return Instant
     */
    public Instant getAnalysisStop() {
        return this.analysisStop;
    }

    /**
     * Gets maxSubmissionNumber value
     *
     * @return Integer
     */
    public Integer getMaxSubmissionNumber() {
        return this.maxSubmissionNumber;
    }

    /**
     * Gets maxUserTestNumber value
     *
     * @return Integer
     */
    public Integer getMaxUserTestNumber() {
        return this.maxUserTestNumber;
    }

    /**
     * Gets minSubmissionInterval value
     *
     * @return LocalTime
     */
    public LocalTime getMinSubmissionInterval() {
        return this.minSubmissionInterval;
    }

    /**
     * Gets minUserTestInterval value
     *
     * @return LocalTime
     */
    public LocalTime getMinUserTestInterval() {
        return this.minUserTestInterval;
    }

    /**
     * Gets scorePrecision value
     *
     * @return Integer
     */
    public Integer getScorePrecision() {
        return this.scorePrecision;
    }

    /**
     * Gets tasks value
     *
     * @return Set
     */
    public Set<Task> getTasks() {
        return this.tasks;
    }

    /**
     * This `equals` implementation is specific for JPA entities and uses
     * the entity identifier for it, following the article in
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     *
     * @param obj
     * @return Boolean
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof Contest)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Contest) obj).getId());
    }

    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able
     * to identify the entity in collections after a new id is assigned to the entity, following the article in
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     *
     * @return Integer
     */
    public int hashCode() {
        return 31;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return String
     */
    public String toString() {
        return "Contest {" + "id='" + id + '\'' + ", version='" + version + '\'' + ", name='" + name + '\'' + ", description='" + description + '\'' + ", allowedLocalizations='" + allowedLocalizations + '\'' + ", languages='" + languages + '\'' + ", submissionsDownloadAllowed='" + submissionsDownloadAllowed + '\'' + ", allowQuestions='" + allowQuestions + '\'' + ", allowUserTests='" + allowUserTests + '\'' + ", blockHiddenParticipations='" + blockHiddenParticipations + '\'' + ", allowPasswordAuthentication='" + allowPasswordAuthentication + '\'' + ", ipRestriction='" + ipRestriction + '\'' + ", ipAutologin='" + ipAutologin + '\'' + ", tokenMaxNumber='" + tokenMaxNumber + '\'' + ", tokenGenInitial='" + tokenGenInitial + '\'' + ", tokenGenNumber='" + tokenGenNumber + '\'' + ", tokenGenMax='" + tokenGenMax + '\'' + ", analysisEnabled='" + analysisEnabled + '\'' + ", maxSubmissionNumber='" + maxSubmissionNumber + '\'' + ", maxUserTestNumber='" + maxUserTestNumber + '\'' + ", scorePrecision='" + scorePrecision + '\'' + "}" + super.toString();
    }
}
