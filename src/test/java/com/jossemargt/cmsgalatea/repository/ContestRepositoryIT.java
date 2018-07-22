package com.jossemargt.cmsgalatea.repository;
import com.jossemargt.cmsgalatea.dod.DataOnDemandConfiguration;
import com.jossemargt.cmsgalatea.model.dod.ContestDataOnDemand;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;

/**
 * = ContestRepositoryIT
 TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = ContestRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = ContestDataOnDemand.class)
public class ContestRepositoryIT {
}
