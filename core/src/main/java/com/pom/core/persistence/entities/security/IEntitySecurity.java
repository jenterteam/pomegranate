package com.pom.core.persistence.entities.security;

import com.pom.core.persistence.enums.CrudType;

/**
 * Base entity security class for all entities.
 */
public interface IEntitySecurity {
    /**
     * 1
     * @param crudType
     */
    void addCrudType(CrudType[] crudType);

    /**
     * 2
     * @param attirubeName
     */
    void addEntityAttributes(String[] attirubeName);

    /**
     * 3
     * @return
     */
    CrudType[] getCrudType();

    /**
     * 4
     * @return
     */
    String[] getEntityAttributes();
}
