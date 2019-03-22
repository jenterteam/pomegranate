package com.pom.cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.CacheConfiguration;
import net.sf.ehcache.config.Configuration;
import com.pom.core.cache.ICacheService;


public class CacheServiceImpl implements ICacheService {

    private CacheManager manager;

    /**
     * Initial start cache manager
     */
    public void init() {
        Configuration configuration = new Configuration().defaultCache(new CacheConfiguration("defaultCache", 1000))
                .cache(new CacheConfiguration("pomegranate-cache", 1000).timeToIdleSeconds(0).timeToLiveSeconds(0));
        manager = CacheManager.create(configuration);
    }

    /**
     * Destroy cache
     */
    public void destroy() {
        manager.shutdown();
    }

    /**
     * Call the Get key cache object
     * @param key
     * @return
     */
    @Override
    public Object get(Object key) {
        if (null == manager.getCache("pomegranate-cache").get(key)) {
            return null;
        }
        Element elt = manager.getCache("pomegranate-cache").get(key);
        return elt.getObjectValue();
    }

    /**
     * Cache add
     * @param key
     * @param value
     */
    @Override
    public void put(Object key, Object value) {
        manager.getCache("pomegranate-cache").put(new Element(key, value));
    }
}
