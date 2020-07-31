/**
 * @project voguedb  V1.0
 * @filename: NodesConfig.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.core;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName: NodesConfig
 * @Description: TODO(节点配置)
 * @author kinbug
 * @date 2020年7月31日
 */
public class NodeConfig {
	
	private Integer id;
	
	private String host;
	
	private Integer port;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the port
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(Integer port) {
		this.port = port;
	}

	public NodeConfig() {
		super();
	}
	
	/**
	 * @param id
	 * @param host
	 * @param port
	 */
	public NodeConfig(Integer id, String host, Integer port) {
		super();
		this.id = id;
		this.host = host;
		this.port = port;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	
}
