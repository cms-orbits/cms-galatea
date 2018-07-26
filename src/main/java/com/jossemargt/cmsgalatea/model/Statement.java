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
import org.hibernate.annotations.Type;
import io.springlets.format.EntityFormat;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * = Statement
 TODO Auto-generated class documentation
 *
 */

@RooJpaEntity(table = "statements")
@Entity
@Table(name = "statements")
public class Statement {

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
     * Statement's language short code Ex.: en, en_US
     */
    @NotNull
    private String language;

    /**
     * Statement's (blob) content
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @NotNull
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "digest")
    private String content;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    private Task task;
    
    
    public Statement() {};

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
     * Gets language value
     *
     * @return String
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Gets content value
     *
     * @return String
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Gets task value
     *
     * @return Task
     */
    public Task getTask() {
        return this.task;
    }
    
    public void setTask(Task task) {
        this.task = task;
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
        if (!(obj instanceof Statement)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Statement) obj).getId());
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
        return "Statement {" + "id='" + id + '\'' + ", version='" + version + '\'' + ", language='" + language + '\'' + ", content='" + content + '\'' + "}" + super.toString();
    }
}
