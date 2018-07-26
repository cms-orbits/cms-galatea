package com.jossemargt.cmsgalatea.model;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import java.util.ArrayList;
import java.util.*;
import javax.persistence.OneToMany;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * = Task
 TODO Auto-generated class documentation
 *
 */
@RooJpaEntity(table = "tasks", readOnly = true)
@Entity
@Table(name = "tasks")
public class Task {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Version
    @Transient
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
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "task")
//    private Dataset activeDataset;

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
    private Set<Statement> statements = new HashSet<Statement>();

    /**
     * All the statement's attachments.
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "task")
    @RooJpaRelation(type = JpaRelationType.COMPOSITION)
    private List<Attachment> attachments = new ArrayList<Attachment>();

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
     * Gets num value
     *
     * @return Integer
     */
    public Integer getNum() {
        return this.num;
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
     * Gets title value
     *
     * @return String
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Gets primaryStatements value
     *
     * @return String
     */
    public String getPrimaryStatements() {
        return this.primaryStatements;
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
     * Gets scoreMode value
     *
     * @return ScoreMode
     */
    public ScoreMode getScoreMode() {
        return this.scoreMode;
    }

    /**
     * Gets contest value
     *
     * @return Contest
     */
    public Contest getContest() {
        return this.contest;
    }

    /**
     * Gets activeDataset value
     *
     * @return Dataset
     */
/*    public Dataset getActiveDataset() {
        return this.activeDataset;
    }*/

    /**
     * Gets submissionFileFormats value
     *
     * @return List
     */
    public List<SubmissionFormatElement> getSubmissionFileFormats() {
        return this.submissionFileFormats;
    }

    /**
     * Gets statements value
     *
     * @return List
     */
    public Set<Statement> getStatements() {
        return this.statements;
    }
    
    /**
     * Gets statements value
     *
     * @return List
     */
    public void setStatements(Set<Statement> statements) {
        this.statements = statements;
    }

    /**
     * Gets attachments value
     *
     * @return List
     */
    public List<Attachment> getAttachments() {
        return this.attachments;
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
        if (!(obj instanceof Task)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Task) obj).getId());
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
        return "Task {" + "id='" + id + '\'' + ", version='" + version + '\'' + ", num='" + num + '\'' + ", name='" + name + '\'' + ", title='" + title + '\'' + ", primaryStatements='" + primaryStatements + '\'' + ", tokenMaxNumber='" + tokenMaxNumber + '\'' + ", tokenGenInitial='" + tokenGenInitial + '\'' + ", tokenGenNumber='" + tokenGenNumber + '\'' + ", tokenGenMax='" + tokenGenMax + '\'' + ", maxSubmissionNumber='" + maxSubmissionNumber + '\'' + ", maxUserTestNumber='" + maxUserTestNumber + '\'' + ", scorePrecision='" + scorePrecision + '\'' + "}" + super.toString();
    }
}
