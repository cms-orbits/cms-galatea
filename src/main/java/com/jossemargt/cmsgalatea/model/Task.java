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
import org.springframework.format.annotation.NumberFormat;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.validation.constraints.Min;
import java.time.LocalTime;
import org.springframework.format.annotation.DateTimeFormat;
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;

/**
 * = Task
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooJpaEntity(table = "tasks", readOnly = true)
@RooEquals(isJpaEntity = true)
public class Task {

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
     * Display ordinal number
     */
    @NumberFormat
    private Integer num;

    /**
     * Short human readable name AKA slug
     */
    @NotNull
    @Column(unique = true)
    private String name;

    /**
     * Long human readable name
     */
    @NotNull
    private String title;

    /**
     * Available task statement languages JSON array
     */
    @NotNull
    @Value("[]")
    @Column(name = "primary_statements")
    private String primaryStatements;

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
     * The tasks scoring kind.
     */
    @NotNull
    @Column(name = "score_mode")
    @Enumerated(EnumType.STRING)
    private ScoreMode scoreMode;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contest_id")
    @EntityFormat
    private Contest contest;

    /**
     * The Dataset currently being used for scoring.
     */
    @OneToOne(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, orphanRemoval = false, fetch = FetchType.LAZY, mappedBy = "task")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    @EntityFormat
    private Dataset activeDataset;

    /**
     * The filename formats that the participant's submissions must follow.
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "task")
    @RooJpaRelation(type = JpaRelationType.COMPOSITION)
    private List<SubmissionFormatElement> submissionFileFormats = new ArrayList<SubmissionFormatElement>();

    /**
     * All the task's statements in different languages.
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "task")
    @RooJpaRelation(type = JpaRelationType.COMPOSITION)
    private List<Statement> statements = new ArrayList<Statement>();

    /**
     * All the statement's attachments.
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "task")
    @RooJpaRelation(type = JpaRelationType.COMPOSITION)
    private List<Attachment> attachments = new ArrayList<Attachment>();
}
