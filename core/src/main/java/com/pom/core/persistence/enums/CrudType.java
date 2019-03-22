package com.pom.core.persistence.enums;

public enum CrudType {
    CREATE(1), READ(2), UPDATE(3), DELETE(4), LOGIN(5);

    private int id;

    private CrudType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * @return
     */
    public static CrudType getType(Integer id) {
        if (id == null) {
            return null;
        }
        for (CrudType crudType : CrudType.values()) {
            if (id.equals(crudType.getId())) {
                return crudType;
            }
        }
        throw new IllegalArgumentException("No matching type for id: " + id);
    }

}