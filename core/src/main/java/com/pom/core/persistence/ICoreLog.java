package com.pom.core.persistence;

import com.pom.core.persistence.entities.IEntity;
import com.pom.core.persistence.enums.CrudType;
/**
 *  Created by mustafagungor on 21.03.2019
 */
public interface ICoreLog extends IEntity {
    /**
     * 1
     * @return LDAO UID of the user
     */
    String getUserId();

    /**
     * 2
     * @return CRUD type
     */
    CrudType getCrudType();

    /**
     * 3
     * @return task ID
     */
    Long getTaskId();

    /**
     * 4
     * @return policy ID
     */
    Long getPolicyId();

    /**
     * 5
     * @return profile ID
     */
    Long getProfileId();

    /**
     * 6
     * @return log message
     */
    String getLogMessage();

    /**
     * 7
     * @return binary representation of data in received request
     */
    byte[] getRequestData();

    /**
     * 8
     * @return sender IP
     */
    String getRequestIp();

    /**
     * 9
     * @return
     */
    Boolean getDeleted();
}
