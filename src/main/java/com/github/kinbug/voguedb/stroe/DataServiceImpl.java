/**
 * @project voguedb  V1.0
 * @filename: DataServiceImpl.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.stroe;

/**
 * @ClassName: DataServiceImpl
 * @Description: TODO(类描述)
 * @author kinbug
 * @date 2020年7月31日
 */
public class DataServiceImpl<K, V> implements DataService<K, V> {

	@Override
	public boolean put(String cacheName, K key, V value) {
		return false;
	}

	@Override
	public boolean delete(String cacheName, K key) {
		return false;
	}

	@Override
	public V getAndDelete(String cacheName, K key) {
		return null;
	}

	@Override
	public V get(String cacheName, K key) {
		return null;
	}

}
