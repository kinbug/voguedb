/**
 * @project voguedb  V1.0
 * @filename: DbStore.java 2020年7月26日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.data;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: DbStore
 * @Description: TODO(数据存储中心)
 * @author kinbug
 * @date 2020年7月26日
 */
public class DB {

	private final ConcurrentHashMap<String, Object> cache = new ConcurrentHashMap<String, Object>();

	// 获取缓存中的实例名字
	public Object getCache(String cacheName) {
		return this.cache.get(cacheName);
	}

	// 创建实例
	public Object createCache(String cacheName, Object object) {
		return this.cache.put(cacheName, object);
	}
}
