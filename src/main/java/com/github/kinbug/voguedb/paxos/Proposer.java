/**
 * @project voguedb  V1.0
 * @filename: Proposer.java 2020年7月25日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.paxos;

import java.util.Map;

/**
 * @ClassName: Proposer
 * @Description: TODO(提议者)
 * @author kinbug
 * @date 2020年7月25日
 */
public class Proposer {
	/**
	 * -提议者id(唯一标识)
	 */
	private int id;

	/**
	 * -提案Map类型,key 为提案编号，value提案值
	 */
	private Map<Integer, String> proporsal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, String> getProporsal() {
		return proporsal;
	}

	public void setProporsal(Map<Integer, String> proporsal) {
		this.proporsal = proporsal;
	}

}
