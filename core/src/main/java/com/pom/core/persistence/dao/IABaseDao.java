package com.pom.core.persistence.dao;

import com.pom.core.persistence.PropertyOrder;
import com.pom.core.persistence.filter.IFilterAndPage;

import java.util.List;
import java.util.Map;

/**
 *
 */
public interface IABaseDao {
    /**
     * 1
     * @param o
     * @return
     * @throws Exception
     */
    Object save(Object o) throws Exception;

    /**
     * 2
     * @param t
     * @return
     * @throws Exception
     */
    Object update(Object t) throws Exception;

    /**
     * 3
     * @param changedMap
     * @return
     * @throws Exception
     */
    Object mapUpdate(Map changedMap) throws Exception;

    /**
     * 4
     * @param id
     * @throws Exception
     */
    void delete(Long id) throws Exception;

    /**
     * 5
     * @param tableName
     * @throws Exception
     */
    void truncate(String tableName) throws Exception;

    /**
     * 6
     * @param id
     * @return
     */
    Object find(Long id);

    /**
     * 7
     * @param maxResults
     * @return
     */
    List<? extends Object> findAll(Integer maxResults);

    /**
     * 8
     * @param propertyName
     * @param value
     * @param maxResults
     * @return
     */
    List<? extends Object> findByProperty(String propertyName, Object value, Integer maxResults);

    /**
     * 9
     * @param propertiesMap
     * @param orders
     * @param maxResults
     * @return
     */
    List<? extends Object> findByProperties(Map<String, Object> propertiesMap, List<PropertyOrder> orders, Integer maxResults);

    /**
     * 10
     * @return
     */
    List getProperties();

    /**
     * 11
     * @param filterAndPage
     * @return
     */
    Map<String,Object> findByFilters(IFilterAndPage filterAndPage);

    /**
     * 12
     * @param filterAndPage
     * @param innerClass
     * @return
     */
    Map<String,Object> findByInnerFilters(IFilterAndPage filterAndPage, Class innerClass);

    /**
     * 13
     * @param filterAndPage
     * @param innerClass
     * @param entityFieldName
     * @return
     */
    Map<String, Object> findByInnerFilters(IFilterAndPage filterAndPage, Class innerClass,String entityFieldName);

    /**
     * 14
     * @param id
     */
    void setLevelId(Long id);

    /**
     * 15
     * @return
     */
    Long getLevelId();

    /**
     * 16
     * @param id
     */
    void setUserId(Long id);

    /**
     * 17
     * @return
     */
    Long getUserId();

    /**
     * 18
     * @param id
     */
    void setUserLevelId(Long id);

    /**
     * 19
     * @return
     */
    Long getUserLevelId();

    /**
     * 20
     * @param selectionMap
     */
    void setSelectionMap(Map<String, String[]> selectionMap);
}
