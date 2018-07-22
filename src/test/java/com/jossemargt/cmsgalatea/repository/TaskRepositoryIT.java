package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.dod.DataOnDemandConfiguration;
import com.jossemargt.cmsgalatea.model.dod.TaskDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import com.jossemargt.cmsgalatea.config.SpringDataJpaDetachableRepositoryConfiguration;
import com.jossemargt.cmsgalatea.model.Task;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * = TaskRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = TaskRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = TaskDataOnDemand.class)
@RunWith(SpringRunner.class)
@DataJpaTest
@Import({ DataOnDemandConfiguration.class, SpringDataJpaDetachableRepositoryConfiguration.class })
public class TaskRepositoryIT {
}
