package com.jossemargt.cmsgalatea.model;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import io.springlets.format.EntityFormat;

/**
 * = ContestByName
 TODO Auto-generated class documentation
 *
 */
@RooDTO
@RooJavaBean
@EntityFormat
public class ContestByName {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String name;

    /**
     * Gets name value
     *
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets name value
     *
     * @param name
     * @return ContestByName
     */
    public ContestByName setName(String name) {
        this.name = name;
        return this;
    }
}
