package com.jossemargt.cmsgalatea.model;
import java.time.Instant;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.dto.annotations.RooEntityProjection;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;

/**
 * = ContestInfo
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooEquals
@RooEntityProjection(entity = Contest.class, fields = { "id", "name", "description", "languages", "startTime", "stopTime" }, formatExpression = "#{id} #{name}")
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
}
