package com.pom.core.persistence.entities;

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
