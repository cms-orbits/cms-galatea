package com.jossemargt.cmsgalatea.model;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;

/**
 * = TaskFindByTitleWithContent
 TODO Auto-generated class documentation
 *
 */
@RooDTO
@RooJavaBean
public class TaskFindByTitleWithContent {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String title;

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
}
