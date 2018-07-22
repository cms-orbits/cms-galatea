package com.jossemargt.cmsgalatea.model;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;
import io.springlets.format.EntityFormat;

/**
 * = TaskByNameWithContent
 TODO Auto-generated class documentation
 *
 */
@RooDTO
@RooJavaBean
@EntityFormat
public class TaskByNameWithContent {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String name;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String contentLanguage;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long contestId;

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
     * @return TaskByNameWithContent
     */
    public TaskByNameWithContent setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Gets contentLanguage value
     *
     * @return String
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Sets contentLanguage value
     *
     * @param contentLanguage
     * @return TaskByNameWithContent
     */
    public TaskByNameWithContent setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Gets contestId value
     *
     * @return Long
     */
    public Long getContestId() {
        return this.contestId;
    }

    /**
     * Sets contestId value
     *
     * @param contestId
     * @return TaskByNameWithContent
     */
    public TaskByNameWithContent setContestId(Long contestId) {
        this.contestId = contestId;
        return this;
    }
}
