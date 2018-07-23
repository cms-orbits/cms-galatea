package com.jossemargt.cmsgalatea.model;
import org.springframework.roo.addon.jpa.annotations.test.RooJpaUnitTest;
import com.jossemargt.cmsgalatea.model.dod.AttachmentFactory;
import com.jossemargt.cmsgalatea.model.dod.DatasetFactory;
import com.jossemargt.cmsgalatea.model.dod.StatementFactory;
import com.jossemargt.cmsgalatea.model.dod.SubmissionFormatElementFactory;
import com.jossemargt.cmsgalatea.model.dod.TaskFactory;

/**
 * = TaskTest
 TODO Auto-generated class documentation
 *
 */
@RooJpaUnitTest(targetClass = Task.class)
public class TaskTest {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SubmissionFormatElementFactory submissionFormatElementFactory = new SubmissionFormatElementFactory();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskFactory taskFactory = new TaskFactory();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private StatementFactory statementFactory = new StatementFactory();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AttachmentFactory attachmentFactory = new AttachmentFactory();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private DatasetFactory datasetFactory = new DatasetFactory();

    /**
     * TODO Auto-generated method documentation
     *
     * @return AttachmentFactory
     */
    public AttachmentFactory getAttachmentFactory() {
        return attachmentFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param attachmentFactory
     */
    public void setAttachmentFactory(AttachmentFactory attachmentFactory) {
        this.attachmentFactory = attachmentFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return DatasetFactory
     */
    public DatasetFactory getDatasetFactory() {
        return datasetFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param datasetFactory
     */
    public void setDatasetFactory(DatasetFactory datasetFactory) {
        this.datasetFactory = datasetFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return StatementFactory
     */
    public StatementFactory getStatementFactory() {
        return statementFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param statementFactory
     */
    public void setStatementFactory(StatementFactory statementFactory) {
        this.statementFactory = statementFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return SubmissionFormatElementFactory
     */
    public SubmissionFormatElementFactory getSubmissionFormatElementFactory() {
        return submissionFormatElementFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param submissionFormatElementFactory
     */
    public void setSubmissionFormatElementFactory(SubmissionFormatElementFactory submissionFormatElementFactory) {
        this.submissionFormatElementFactory = submissionFormatElementFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return TaskFactory
     */
    public TaskFactory getTaskFactory() {
        return taskFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param taskFactory
     */
    public void setTaskFactory(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }
}
