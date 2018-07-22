package com.jossemargt.cmsgalatea.model;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.roo.addon.dto.annotations.RooEntityProjection;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;

/**
 * = DatasetInfo
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooEquals
@RooEntityProjection(entity = Dataset.class, fields = { "id", "description", "timeLimit", "memoryLimit", "taskType", "scoreType" }, formatExpression = "#{id} #{description}")
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
}
