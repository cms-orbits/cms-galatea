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
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * = SubmissionFormatElement
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooJpaEntity(table = "submission_format_elements", readOnly = true)
@RooEquals(isJpaEntity = true)
public class SubmissionFormatElement {

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
     * Submitted file name format. Ex.: myapp.%l or myapp.cpp
     */
    @NotNull
    private String filename;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "task_id")
    @EntityFormat
    private Task task;
}
