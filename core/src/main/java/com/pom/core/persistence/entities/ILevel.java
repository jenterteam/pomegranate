package com.pom.core.persistence.entities;

import com.pom.core.persistence.entities.security.IEntitySecurity;

import java.util.Map;

public interface ILevel extends IEntity<IEntitySecurity> {
    /**
     * 1
     * @return
     */
    String toJson();

    /**
     * 2
     * @return
     */
    Map<String, String> getProperties();

    /**
     * 3
     * @param entitySecurity
     */
    void applyEntitySecurity(IEntitySecurity entitySecurity);

    /**
     * 4
     * @return
     */
    Boolean getDeleted();

    /**
     * 5
     * @param deleted
     */
    void setDeleted(Boolean deleted);

    /**
     * 6
     * @return
     */
    boolean getActive();

    /**
     * 7
     * @return
     */
    String getName();
}
