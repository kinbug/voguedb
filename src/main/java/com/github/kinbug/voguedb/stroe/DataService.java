/**
 * @project voguedb  V1.0
 * @filename: DataService.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.stroe;

/**
 * @ClassName: DataService
 * @Description: TODO(提供的接口)
 * @author kinbug
 * @date 2020年7月31日
 */
public interface DataService<K, V> {

	boolean put(String cacheName, K key, V value);

	boolean delete(String cacheName, K key);

	V getAndDelete(String cacheName, K key);

	V get(String cacheName, K key);

}
