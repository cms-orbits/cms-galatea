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
import javax.persistence.Column;
import org.springframework.beans.factory.annotation.Value;
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * = ExecutionScenario
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooJpaEntity(table = "testcases", readOnly = true)
@RooEquals(isJpaEntity = true)
public class ExecutionScenario {

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
     * Codename identifying the execution scenario (testcase).
     */
    @NotNull
    private String codename;

    /**
     * Execution scenario's visibility on public searches
     */
    @NotNull
    @Value("false")
    @Column(name = "public")
    private Boolean queryable;

    /**
     * Input files digest.
     */
    @NotNull
    @Column(name = "input")
    private String inputFilesDigest;

    /**
     * Output files digest.
     */
    @NotNull
    @Column(name = "output")
    private String outputFilesDigest;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dataset_id")
    @EntityFormat
    private Dataset dataset;
}
