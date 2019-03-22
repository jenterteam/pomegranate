package com.pom.core.persistence.entities;

import com.pom.core.persistence.entities.security.IEntitySecurity;

public interface IRole extends IEntity<IEntitySecurity> {
    /**
     * 1
     * @return
     */
    String getRoleCode();

    /**
     * 2
     * @return
     */
    String getRoleName();

    /**
     * 3
     * @return
     */
    Boolean getDeleted();
}
