package com.pom.core.persistence.entities;

import com.pom.core.persistence.entities.security.IEntitySecurity;

/**
 *
 */
public interface IGroup extends IEntity<IEntitySecurity>{
    /**
     * 1
     * @return
     */
    String getGroupCode();

    /**
     * 2
     * @return
     */
    String getGroupName();

    /**
     * 3
     * @return
     */
    Boolean getDeleted();
}
