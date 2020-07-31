/**
 * @project voguedb  V1.0
 * @filename: Response.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.rpc;

import java.io.Serializable;

/**
 * @ClassName: Response
 * @Description: TODO(RPC请求返回 )
 * @author kinbug
 * @date 2020年7月31日
 */
public class Response<T> implements Serializable{
	
	private static final long serialVersionUID = 5582615886295654189L;
	
	private T result;

	/**
	 * @return the result
	 */
	public T getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(T result) {
		this.result = result;
	}

	public Response(T result) {
		this.result = result;
	}
}
