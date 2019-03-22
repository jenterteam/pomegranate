package com.pom.core.persistence.entities.util;

import com.pom.core.persistence.entities.IEntity;
import com.pom.core.persistence.entities.security.IEntitySecurity;

import java.util.List;
import java.util.Map;

public interface IMenu extends IEntity<IEntitySecurity> {
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
    String getText();

    /**
     * 6
     * @return
     */
    String getPath();

    /**
     * 7
     * @return
     */
    Integer getIndex();

    /**
     * 8
     * @return
     */
    IMenu getParent();

    /**
     * 9
     * @return
     */
    String getModule();

    /**
     * 10
     * @return
     */
    String getIcon();

    /**
     * 11
     * @return
     */
    List<IMenu> getItems();

    /**
     * 12
     * @param items
     */
    void setItems(List<IMenu> items);
}
