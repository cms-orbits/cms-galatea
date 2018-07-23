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
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * = ExecutionScenario
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooJpaEntity(table = "testcases", readOnly = true)
@RooEquals(isJpaEntity = true)
@Entity
@Table(name = "testcases")
@EntityFormat
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
    @Version
    @Transient
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
     * Gets codename value
     *
     * @return String
     */
    public String getCodename() {
        return this.codename;
    }

    /**
     * Gets queryable value
     *
     * @return Boolean
     */
    public Boolean getQueryable() {
        return this.queryable;
    }

    /**
     * Gets inputFilesDigest value
     *
     * @return String
     */
    public String getInputFilesDigest() {
        return this.inputFilesDigest;
    }

    /**
     * Gets outputFilesDigest value
     *
     * @return String
     */
    public String getOutputFilesDigest() {
        return this.outputFilesDigest;
    }

    /**
     * Gets dataset value
     *
     * @return Dataset
     */
    public Dataset getDataset() {
        return this.dataset;
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
        if (!(obj instanceof ExecutionScenario)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((ExecutionScenario) obj).getId());
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
        return "ExecutionScenario {" + "id='" + id + '\'' + ", version='" + version + '\'' + ", codename='" + codename + '\'' + ", queryable='" + queryable + '\'' + ", inputFilesDigest='" + inputFilesDigest + '\'' + ", outputFilesDigest='" + outputFilesDigest + '\'' + "}" + super.toString();
    }
}
