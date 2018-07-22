package com.jossemargt.cmsgalatea.model;
import org.springframework.roo.addon.jpa.annotations.test.RooJpaUnitTest;
import com.jossemargt.cmsgalatea.model.dod.ContestFactory;
import com.jossemargt.cmsgalatea.model.dod.TaskFactory;

/**
 * = ContestTest
 TODO Auto-generated class documentation
 *
 */
@RooJpaUnitTest(targetClass = Contest.class)
public class ContestTest {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskFactory taskFactory = new TaskFactory();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ContestFactory contestFactory = new ContestFactory();

    /**
     * TODO Auto-generated method documentation
     *
     * @return ContestFactory
     */
    public ContestFactory getContestFactory() {
        return contestFactory;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contestFactory
     */
    public void setContestFactory(ContestFactory contestFactory) {
        this.contestFactory = contestFactory;
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
