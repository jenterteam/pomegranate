package com.pom.core.persistence.filter;

/**
 *  Created by mustafagungor on 21.03.2019
 */
public interface IFilter {
    /**
     * 1
     * @return
     */
    String getProperty();

    /**
     * 2
     * @return
     */
    Object getValue();

    /**
     * 3
     * @return
     */
    String getOperator();

    /**
     * 4
     * @param property
     */
    void setProperty(String property);

    /**
     * 5
     * @param value
     */
    void setValue(Object value);

    /**
     * 6
     * @param operator
     */
    void setOperator(String operator);

    /**
     * 7
     * @param filterType
     */
    void setFilterType(String filterType);

    /**
     * 8
     * @param type
     */
    void setType(String type);

    /**
     * 9
     * @param anEnum
     */
    void setIsEnum(boolean anEnum);

    /**
     * 10
     * @return
     */
    String getFilterType();

    /**
     * 11
     * @return
     */
    String getType();

    /**
     * 12
     * @return
     */
    boolean getIsEnum();

}
