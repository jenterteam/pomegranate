package com.pom.core.persistence.dao;

import com.pom.core.persistence.PropertyOrder;

import java.util.List;
import java.util.Map;

public interface IBaseDao<T>  {
    /**
     * 1
     * @param o
     * @return
     * @throws Exception
     */
    T save(T o) throws Exception;

    /**
     * 2
     * @param t
     * @return
     * @throws Exception
     */
    T update(T t) throws Exception;

    /**
     * 3
     * @param id
     */
    void delete(Long id);

    /**
     * 4
     * @param id
     * @return
     */
    T find(Long id);

    /**
     * 5
     * @param obj
     * @param maxResults
     * @return
     */
    List<? extends T> findAll(Class<? extends T> obj, Integer maxResults);

    /**
     * 6
     * @param obj
     * @param propertyName
     * @param value
     * @param maxResults
     * @return
     */
    List<? extends T> findByProperty(Class<? extends T> obj, String propertyName, Object value, Integer maxResults);

    /**
     * 7
     * @param obj
     * @param propertiesMap
     * @param orders
     * @param maxResults
     * @return
     */
    List<? extends T> findByProperties(Class<? extends T> obj, Map<String, Object> propertiesMap,
                                       List<PropertyOrder> orders, Integer maxResults);
}
