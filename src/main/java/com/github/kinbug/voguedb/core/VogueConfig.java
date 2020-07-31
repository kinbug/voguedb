/**
 * @project voguedb  V1.0
 * @filename: VogueConfig.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.core;

import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName: VogueConfig
 * @Description: TODO(全局配置)
 * @author kinbug
 * @date 2020年7月31日
 */
public class VogueConfig {

	private Integer currentId;

	private Integer timeOut;

	private Integer learningInterval;

	private String dataDir;

	private Boolean enableDataPersistence;
	
	private List<NodeConfig> nodes;

	/**
	 * @return the currentId
	 */
	public Integer getCurrentId() {
		return currentId;
	}

	/**
	 * @param currentId the currentId to set
	 */
	public void setCurrentId(Integer currentId) {
		this.currentId = currentId;
	}

	/**
	 * @return the timeOut
	 */
	public Integer getTimeOut() {
		return timeOut;
	}

	/**
	 * @param timeOut the timeOut to set
	 */
	public void setTimeOut(Integer timeOut) {
		this.timeOut = timeOut;
	}

	/**
	 * @return the learningInterval
	 */
	public Integer getLearningInterval() {
		return learningInterval;
	}

	/**
	 * @param learningInterval the learningInterval to set
	 */
	public void setLearningInterval(Integer learningInterval) {
		this.learningInterval = learningInterval;
	}

	/**
	 * @return the dataDir
	 */
	public String getDataDir() {
		return dataDir;
	}

	/**
	 * @param dataDir the dataDir to set
	 */
	public void setDataDir(String dataDir) {
		this.dataDir = dataDir;
	}

	/**
	 * @return the enableDataPersistence
	 */
	public Boolean getEnableDataPersistence() {
		return enableDataPersistence;
	}

	/**
	 * @param enableDataPersistence the enableDataPersistence to set
	 */
	public void setEnableDataPersistence(Boolean enableDataPersistence) {
		this.enableDataPersistence = enableDataPersistence;
	}

	/**
	 * @return the nodes
	 */
	public List<NodeConfig> getNodes() {
		return nodes;
	}

	/**
	 * @param nodes the nodes to set
	 */
	public void setNodes(List<NodeConfig> nodes) {
		this.nodes = nodes;
	}

	public VogueConfig() {
		super();
	}

	/**
	 * @param currentId
	 * @param timeOut
	 * @param learningInterval
	 * @param dataDir
	 * @param enableDataPersistence
	 * @param nodes
	 */
	public VogueConfig(Integer currentId, Integer timeOut, Integer learningInterval, String dataDir,
			Boolean enableDataPersistence, List<NodeConfig> nodes) {
		super();
		this.currentId = currentId;
		this.timeOut = timeOut;
		this.learningInterval = learningInterval;
		this.dataDir = dataDir;
		this.enableDataPersistence = enableDataPersistence;
		this.nodes = nodes;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
