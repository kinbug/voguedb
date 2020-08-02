/**
 * @project voguedb  V1.0
 * @filename: RequestType.java 2020年8月2日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.enums;

import java.util.Arrays;
import java.util.Optional;

/**
 * @ClassName: RequestType
 * @Description: TODO(请求类型)
 * @author kinbug
 * @date 2020年8月2日
 */
public enum EnumReqType {

	VOTE(0, "投票请求"), ENTRIES_ADD(1, "添加日志"), CLIENT_REQ(2, "客服端请求"), CONFIG_ADD(3, "添加配置"), CONFIG_REMOVE(4, "移除配置");

	private int code;

	private String explain;

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the explain
	 */
	public String getExplain() {
		return explain;
	}

	/**
	 * @param explain the explain to set
	 */
	public void setExplain(String explain) {
		this.explain = explain;
	}

	EnumReqType(int code, String explain) {
		this.code = code;
		this.explain = explain;
	}

	public static Optional<EnumReqType> of(int code) {
		return Arrays.stream(values()).filter(i -> i.code == code).findFirst();
	}
}
