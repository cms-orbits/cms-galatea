package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.dod.DataOnDemandConfiguration;
import com.jossemargt.cmsgalatea.model.dod.TaskDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = TaskRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = TaskRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = TaskDataOnDemand.class)
public class TaskRepositoryIT {
}
