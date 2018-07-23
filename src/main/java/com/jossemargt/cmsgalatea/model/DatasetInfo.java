package com.jossemargt.cmsgalatea.model;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.roo.addon.dto.annotations.RooEntityProjection;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import io.springlets.format.EntityFormat;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * = DatasetInfo
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooEquals
@RooEntityProjection(entity = Dataset.class, fields = { "id", "description", "timeLimit", "memoryLimit", "taskType", "scoreType" }, formatExpression = "#{id} #{description}")
@EntityFormat("#{id} #{description}")
public class DatasetInfo {

    private Long id;

    @NotNull
    private String description;

    @Min(1L)
    @NumberFormat
    private Float timeLimit;

    @Min(1L)
    @NumberFormat
    private Float memoryLimit;

    @NotNull
    private String taskType;

    @NotNull
    private String scoreType;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param id
     * @param description
     * @param timeLimit
     * @param memoryLimit
     * @param taskType
     * @param scoreType
     */
    public DatasetInfo(Long id, String description, Float timeLimit, Float memoryLimit, String taskType, String scoreType) {
        this.id = id;
        this.description = description;
        this.timeLimit = timeLimit;
        this.memoryLimit = memoryLimit;
        this.taskType = taskType;
        this.scoreType = scoreType;
    }

    /**
     * Gets id value
     *
     * @return Long
     */
    public Long getId() {
        return this.id;
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
     * Gets scoreType value
     *
     * @return String
     */
    public String getScoreType() {
        return this.scoreType;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param obj
     * @return Boolean
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof DatasetInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        DatasetInfo rhs = (DatasetInfo) obj;
        return new EqualsBuilder().append(description, rhs.description).append(id, rhs.id).append(memoryLimit, rhs.memoryLimit).append(scoreType, rhs.scoreType).append(taskType, rhs.taskType).append(timeLimit, rhs.timeLimit).isEquals();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Integer
     */
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(id).append(memoryLimit).append(scoreType).append(taskType).append(timeLimit).toHashCode();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return String
     */
    public String toString() {
        return "DatasetInfo {" + "id='" + id + '\'' + ", description='" + description + '\'' + ", timeLimit='" + timeLimit + '\'' + ", memoryLimit='" + memoryLimit + '\'' + ", taskType='" + taskType + '\'' + ", scoreType='" + scoreType + '\'' + "}" + super.toString();
    }
}
