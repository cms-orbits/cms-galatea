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

/**
 * = Contest
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooJpaEntity(table = "contests", readOnly = true)
@RooEquals(isJpaEntity = true)
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
    @Version @Transient
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
}
