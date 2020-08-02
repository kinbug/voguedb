/**
 * @project voguedb  V1.0
 * @filename: Request.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.rpc.entity;

import java.io.Serializable;

import com.github.kinbug.voguedb.enums.EnumReqType;

/**
 * @ClassName: Request
 * @Description: TODO(类描述)
 * @author kinbug
 * @date 2020年7月31日
 */
public class Request<P> implements Serializable {

	private static final long serialVersionUID = 1423034222392371339L;

	private EnumReqType enumReqType;
	
	private P param;
	
	/**
	 * @return the enumReqType
	 */
	public EnumReqType getEnumReqType() {
		return enumReqType;
	}

	/**
	 * @param enumReqType the enumReqType to set
	 */
	public void setEnumReqType(EnumReqType enumReqType) {
		this.enumReqType = enumReqType;
	}

	/**
	 * @return the param
	 */
	public P getParam() {
		return param;
	}

	/**
	 * @param param the param to set
	 */
	public void setParam(P param) {
		this.param = param;
	}
	 
}
