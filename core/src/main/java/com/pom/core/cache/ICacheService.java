package com.pom.core.cache;


public interface ICacheService {
    /**
     * @param key
     * @return
     */
    Object get(Object key);

    /**
     * @param key
     * @param value
     */
    void put(Object key,Object value);
}
