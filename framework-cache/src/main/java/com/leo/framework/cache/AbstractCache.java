package com.leo.framework.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractCache<K, V> implements Cache<K, V> {
    private Map<K, V> cache;

    protected AbstractCache() {
        this.cache = new ConcurrentHashMap<>();
    }

    @Override
    public void put(K key, V value) {
        cache.put(key, value);
    }

    @Override
    public V get(K key) {
        return cache.get(key);
    }

    @Override
    public void remove(K key) {
        cache.remove(key);
    }

    @Override
    public void clear() {
        cache.clear();
    }

    @Override
    public int getKeyCount() {
        return cache.size();
    }
}
