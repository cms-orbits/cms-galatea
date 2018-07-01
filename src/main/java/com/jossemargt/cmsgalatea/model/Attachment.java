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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import io.springlets.format.EntityFormat;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * = Attachment
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooJpaEntity(table = "attachments", readOnly = true)
@RooEquals(isJpaEntity = true)
public class Attachment {

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
     * Attachment's file name
     */
    @NotNull
    private String filename;

    /**
     * Attachment's (blob) content
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @NotNull
    @Column(name = "digest")
    private String content;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    @EntityFormat
    private Task task;
}
