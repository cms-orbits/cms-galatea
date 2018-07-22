package com.jossemargt.cmsgalatea.config;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryConfiguration;
import com.jossemargt.cmsgalatea.CmsgalateaApplication;
import io.springlets.data.jpa.repository.support.DetachableJpaRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * = SpringDataJpaDetachableRepositoryConfiguration
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepositoryConfiguration
@Configuration
@EnableJpaRepositories(repositoryBaseClass = DetachableJpaRepositoryImpl.class, basePackageClasses = CmsgalateaApplication.class)
public class SpringDataJpaDetachableRepositoryConfiguration {
}
