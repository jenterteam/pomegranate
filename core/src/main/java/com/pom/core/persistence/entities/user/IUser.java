package com.pom.core.persistence.entities.user;

import com.pom.core.persistence.entities.IEntity;
import com.pom.core.persistence.entities.security.IEntitySecurity;
import com.pom.core.persistence.entities.util.IRole;

import java.util.List;

public interface IUser extends IEntity<IEntitySecurity> {
    /**
     * 1
     * @return
     */
    Boolean getActive();

    /**
     * 2
     * @return
     */
    String getUserName();

    /**
     * 3
     * @return
     */
    String getPassword();

    /**
     * 4
     * @return
     */
    String getName();

    /**
     * 5
     * @return
     */
    String getSurname();

    /**
     * 6
     * @return
     */
    String getEmail();

    /**
     * 7
     * @return
     */
    IRole getRole();

    /**
     * 8
     * @return
     */
    List<? extends IGroup> getGroups();

    /**
     * 9
     * @param groups
     */
    void setGroups(List<? extends IGroup> groups);

    /**
     * 10
     * @return
     */
    Boolean getDeleted();

    /**
     * 11
     * @param b
     */
    void setActive(Boolean b);

    /**
     * 12
     * @return
     */
    String toJson();
}
