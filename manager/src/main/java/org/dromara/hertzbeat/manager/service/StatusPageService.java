package org.dromara.hertzbeat.manager.service;

import org.dromara.hertzbeat.common.entity.manager.StatusPageComponent;
import org.dromara.hertzbeat.common.entity.manager.StatusPageOrg;
import org.dromara.hertzbeat.manager.pojo.dto.ComponentStatus;

import java.util.List;

/**
 * status page service interface.
 * @author tom
 */
public interface StatusPageService {

    /**
     * query status page organization.
     * @return status page organization
     */
    StatusPageOrg queryStatusPageOrg();

    /**
     * save status page organization.
     * @return status page organization
     */
    StatusPageOrg saveStatusPageOrg(StatusPageOrg statusPageOrg);
    
    /**
     * query status page components.
     * @return status page components
     */
    List<StatusPageComponent> queryStatusPageComponents();
    
    /**
     * save status page component.
     * @param statusPageComponent status page component
     */
    void newStatusPageComponent(StatusPageComponent statusPageComponent);
    
    /**
     * update status page component.
     * @param statusPageComponent status page component
     */
    void updateStatusPageComponent(StatusPageComponent statusPageComponent);

    /**
     * delete status page component.
     * @param id status page component id
     */
    void deleteStatusPageComponent(long id);

    /**
     * query status page component.
     * @param id status page component id
     * @return status page component
     */
    StatusPageComponent queryStatusPageComponent(long id);

    /**
     * query status page components status.
     * @return status page components status
     */
    List<ComponentStatus> queryComponentsStatus();

    /**
     * query status page component status.
     * @param id status page component id
     * @return status page component status
     */
    ComponentStatus queryComponentStatus(long id);
}
