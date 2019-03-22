package com.pom.core.persistence.entities.user;

import com.pom.core.persistence.entities.IEntity;
import com.pom.core.persistence.enums.SessionEvent;

public interface IUserSession extends IEntity {
    /**
     * 1
     * @return
     */
    String getUsername();

    /**
     * 2
     * @return
     */
    SessionEvent getSessionEvent();
}
