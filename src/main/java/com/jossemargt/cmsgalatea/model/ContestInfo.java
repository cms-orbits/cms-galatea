package com.jossemargt.cmsgalatea.model;
import java.time.Instant;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.dto.annotations.RooEntityProjection;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import io.springlets.format.EntityFormat;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * = ContestInfo
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooEquals
@RooEntityProjection(entity = Contest.class, fields = { "id", "name", "description", "languages", "startTime", "stopTime" }, formatExpression = "#{id} #{name}")
@EntityFormat("#{id} #{name}")
public class ContestInfo {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    @Value("Java / JDK,C# / Mono,Python 2 / CPython,Python 3 / CPython")
    private String languages;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Instant startTime;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Instant stopTime;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param id
     * @param name
     * @param description
     * @param languages
     * @param startTime
     * @param stopTime
     */
    public ContestInfo(Long id, String name, String description, String languages, Instant startTime, Instant stopTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.languages = languages;
        this.startTime = startTime;
        this.stopTime = stopTime;
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
     * Gets languages value
     *
     * @return String
     */
    public String getLanguages() {
        return this.languages;
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
     * TODO Auto-generated method documentation
     *
     * @param obj
     * @return Boolean
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof ContestInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ContestInfo rhs = (ContestInfo) obj;
        return new EqualsBuilder().append(description, rhs.description).append(id, rhs.id).append(languages, rhs.languages).append(name, rhs.name).append(startTime, rhs.startTime).append(stopTime, rhs.stopTime).isEquals();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Integer
     */
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(id).append(languages).append(name).append(startTime).append(stopTime).toHashCode();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return String
     */
    public String toString() {
        return "ContestInfo {" + "id='" + id + '\'' + ", name='" + name + '\'' + ", description='" + description + '\'' + ", languages='" + languages + '\'' + "}" + super.toString();
    }
}
