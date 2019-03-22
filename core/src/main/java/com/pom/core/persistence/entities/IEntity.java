package com.pom.core.persistence.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * BaseEntity class
 * @param <T>
 */
public interface IEntity<T> extends Serializable {
    /**
     * 1
     * @return record ID
     */
    Long getId();

    /**
     * 2
     * @return record creation date
     */
    Date getCreateDate();

    /**
     * 3
     * @return
     */
    Boolean getDeleted();

    /**
     *
     * @param deleted
     */
    void setDeleted(Boolean deleted);

    /**
     *
     * @param createDate
     */
    void setCreateDate(Date createDate);

    /**
     * TODO : VERSION eklenecek
     */
    Long version(Long version);
}
