package com.pom.core.persistence.entities;

import com.pom.core.persistence.entities.security.IEntitySecurity;

import java.util.List;
import java.util.Map;

/**
 * Tüm illeri ülkeye göre çekecek kod
 */
public interface IIl extends IEntity<IEntitySecurity>{
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
     * 7
     * @return
     */
    List<? extends IIlce> getIlceList();

    /**
     * 8
     * @return
     */
    Map<String, Object> getUlke();

    /**
     * 9
     * @return
     */
    IUlke getUlkeObj();
}
