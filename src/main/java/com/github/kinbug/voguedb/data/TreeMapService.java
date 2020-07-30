/**
 * @project voguedb  V1.0
 * @filename: TreeMapService.java 2020年7月26日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.data;

import java.util.TreeMap;

/**
 * @ClassName: TreeMapService
 * @Description: TODO(类描述)
 * @author kinbug
 * @date 2020年7月26日
 */
public interface TreeMapService<K, V> {
	
	TreeMap<K, V> getTreeMap(String name);
	
	V get(Object k);
}
