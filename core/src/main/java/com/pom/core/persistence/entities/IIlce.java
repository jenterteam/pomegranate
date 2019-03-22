package com.pom.core.persistence.entities;

import com.pom.core.persistence.entities.security.IEntitySecurity;

import java.util.Map;

public interface IIlce extends IEntity<IEntitySecurity>{
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
    String getKodu();

    /**
     * 6
     * @return
     */
    String getAdi();

    /**
     * todo
     * @return
     */
    Map<String, Object> getIl();

    /**
     * todo
     * @return
     */
    IIl getIlObj();
}
