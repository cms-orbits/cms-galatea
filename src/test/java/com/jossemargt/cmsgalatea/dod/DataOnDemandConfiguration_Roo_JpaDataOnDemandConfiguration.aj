// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.jossemargt.cmsgalatea.dod;

import com.jossemargt.cmsgalatea.dod.DataOnDemandConfiguration;
import com.jossemargt.cmsgalatea.model.dod.ContestDataOnDemand;
import com.jossemargt.cmsgalatea.model.dod.TaskDataOnDemand;
import javax.persistence.EntityManager;
import org.springframework.context.annotation.Bean;

privileged aspect DataOnDemandConfiguration_Roo_JpaDataOnDemandConfiguration {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EntityManager DataOnDemandConfiguration.entityManager;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return EntityManager
     */
    public EntityManager DataOnDemandConfiguration.getEntityManager() {
        return entityManager;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entityManager
     */
    public void DataOnDemandConfiguration.setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ContestDataOnDemand
     */
    @Bean
    public ContestDataOnDemand DataOnDemandConfiguration.contestDataOnDemand() {
        return new ContestDataOnDemand(getEntityManager());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return TaskDataOnDemand
     */
    @Bean
    public TaskDataOnDemand DataOnDemandConfiguration.taskDataOnDemand() {
        return new TaskDataOnDemand(getEntityManager());
    }
    
}
