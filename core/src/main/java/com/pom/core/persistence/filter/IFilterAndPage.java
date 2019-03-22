package com.pom.core.persistence.filter;

import java.util.List;
import java.util.Map;

/**
 *  Created by mustafagungor on 21.03.2019
 */
public interface IFilterAndPage {
    /**
     * 1
     * @return
     */
    List<? extends IFilter> getFilters();

    /**
     * 2
     * @return
     */
    Integer getPage();

    /**
     * 3
     * @return
     */
    Integer getStart();

    /**
     * 4
     * @return
     */
    Integer getLimit();

    /**
     * 5
     * @return
     */
    Long getLevelId();

    /**
     * 6
     * @param filters
     */
    void setFilters(List<? extends IFilter> filters);

    /**
     * 7
     * @param page
     */
    void setPage(Integer page);

    /**
     * 8
     * @param start
     */
    void setStart(Integer start);

    /**
     * 9
     * @param limit
     */
    void setLimit(Integer limit);

    /**
     * 10
     * @param levelId
     */
    void setLevelId(Long levelId);

    /**
     * 11
     * @return
     */
    Map<String, String[]> getSelectionMap();

    /**
     * 12
     * @param selectionMap
     */
    void setSelectionMap(Map<String, String[]> selectionMap);

    /**
     * 13
     * @return
     */
    String getFullQueryString();

    /**
     * 14
     * @param fullQueryString
     */
    void setFullQueryString(String fullQueryString);
}
