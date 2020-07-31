/**
 * @project voguedb  V1.0
 * @filename: Request.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.rpc;

import java.io.Serializable;

/**
 * @ClassName: Request
 * @Description: TODO(类描述)
 * @author kinbug
 * @date 2020年7月31日
 */
public class Request<P> implements Serializable {

	private static final long serialVersionUID = 1423034222392371339L;

	 private P param;

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
