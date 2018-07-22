package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Task;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooJsonMixin;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.jossemargt.cmsgalatea.model.Attachment;
import com.jossemargt.cmsgalatea.model.Contest;
import com.jossemargt.cmsgalatea.model.Statement;
import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import java.util.List;

/**
 * = TaskJsonMixin
 TODO Auto-generated class documentation
 *
 */
@RooJsonMixin(entity = Task.class)
@JsonIdentityInfo(generator = PropertyGenerator.class, property = "id")
public abstract class TaskJsonMixin {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonIgnore
    private List<Attachment> attachments;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonDeserialize(using = ContestDeserializer.class)
    private Contest contest;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonIgnore
    private List<Statement> statements;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @JsonIgnore
    private List<SubmissionFormatElement> submissionFileFormats;

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param attachments
     */
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public List<Statement> getStatements() {
        return statements;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param statements
     */
    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return List
     */
    public List<SubmissionFormatElement> getSubmissionFileFormats() {
        return submissionFileFormats;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param submissionFileFormats
     */
    public void setSubmissionFileFormats(List<SubmissionFormatElement> submissionFileFormats) {
        this.submissionFileFormats = submissionFileFormats;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Contest
     */
    public Contest getContest() {
        return contest;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contest
     */
    public void setContest(Contest contest) {
        this.contest = contest;
    }
}
