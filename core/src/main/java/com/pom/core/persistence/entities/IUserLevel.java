package com.pom.core.persistence.entities;

import com.pom.core.persistence.entities.security.IEntitySecurity;

import java.util.List;
import java.util.Map;

public interface IUserLevel extends IEntity<IEntitySecurity>{
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
     * @return
     */
    IUser getUser();

    /**
     * 6
     * @return
     */
    ILevel getLevel();

    /**
     * 7
     * @param user
     */
    void setUser(IUser user);

    /**
     * 8
     * @param level
     */
    void setLevel(ILevel level);

    /**
     * 9
     * @return
     */
    List<? extends IGroup> getGroups();

    /**
     * 10
     * @param groups
     */
    void setGroups(List<? extends IGroup> groups);
}
