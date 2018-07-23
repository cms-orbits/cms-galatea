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
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;
import javax.persistence.Column;
import javax.validation.constraints.Min;
import org.springframework.format.annotation.NumberFormat;
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * = Dataset
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooJpaEntity(table = "datasets", readOnly = true)
@RooEquals(isJpaEntity = true)
@Entity
@Table(name = "datasets")
@EntityFormat
public class Dataset {

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
     * A human-readable text describing the dataset.
     */
    @NotNull
    private String description;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Value("false")
    private Boolean autojudge;

    /**
     * Test case's time limit.
     */
    @Column(name = "time_limit")
    @Min(1L)
    @NumberFormat
    private Float timeLimit;

    /**
     * Test case's memory limit.
     */
    @Column(name = "memory_limit")
    @Min(1L)
    @NumberFormat
    private Float memoryLimit;

    /**
     * Name of the TaskType child class suited for the task.
     */
    @NotNull
    @Column(name = "task_type")
    private String taskType;

    /**
     * Parameters for the task type class, JSON encoded.
     */
    @NotNull
    @Column(name = "task_type_parameters")
    private String taskTypeParameters;

    /**
     * Name of the ScoreType child class suited for the task.
     */
    @NotNull
    @Column(name = "score_type")
    private String scoreType;

    /**
     * Parameters for the score type class, JSON encoded.
     */
    @NotNull
    @Column(name = "score_type_parameters")
    private String scoreTypeParameters;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToOne(fetch = FetchType.LAZY)
    @EntityFormat
    private Task task;

    /**
     * All the testcases (ExecutionScenario) assigned to a Dataset
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "dataset")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private List<ExecutionScenario> tasks = new ArrayList<ExecutionScenario>();

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
     * Gets description value
     *
     * @return String
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets autojudge value
     *
     * @return Boolean
     */
    public Boolean getAutojudge() {
        return this.autojudge;
    }

    /**
     * Gets timeLimit value
     *
     * @return Float
     */
    public Float getTimeLimit() {
        return this.timeLimit;
    }

    /**
     * Gets memoryLimit value
     *
     * @return Float
     */
    public Float getMemoryLimit() {
        return this.memoryLimit;
    }

    /**
     * Gets taskType value
     *
     * @return String
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * Gets taskTypeParameters value
     *
     * @return String
     */
    public String getTaskTypeParameters() {
        return this.taskTypeParameters;
    }

    /**
     * Gets scoreType value
     *
     * @return String
     */
    public String getScoreType() {
        return this.scoreType;
    }

    /**
     * Gets scoreTypeParameters value
     *
     * @return String
     */
    public String getScoreTypeParameters() {
        return this.scoreTypeParameters;
    }

    /**
     * Gets task value
     *
     * @return Task
     */
    public Task getTask() {
        return this.task;
    }

    /**
     * Gets tasks value
     *
     * @return List
     */
    public List<ExecutionScenario> getTasks() {
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
        if (!(obj instanceof Dataset)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Dataset) obj).getId());
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
        return "Dataset {" + "id='" + id + '\'' + ", version='" + version + '\'' + ", description='" + description + '\'' + ", autojudge='" + autojudge + '\'' + ", timeLimit='" + timeLimit + '\'' + ", memoryLimit='" + memoryLimit + '\'' + ", taskType='" + taskType + '\'' + ", taskTypeParameters='" + taskTypeParameters + '\'' + ", scoreType='" + scoreType + '\'' + ", scoreTypeParameters='" + scoreTypeParameters + '\'' + "}" + super.toString();
    }
}
