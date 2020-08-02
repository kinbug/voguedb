/**
 * @project voguedb  V1.0
 * @filename: UserProcessor.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.rpc;

import com.alipay.remoting.AsyncContext;
import com.alipay.remoting.BizContext;
import com.alipay.remoting.rpc.protocol.AbstractUserProcessor;

/**
 * @ClassName: UserProcessor
 * @Description: TODO(类描述)
 * @author kinbug
 * @date 2020年7月31日
 */
public class MyUserProcessor<T> extends AbstractUserProcessor<T> {

	@Override
	public void handleRequest(BizContext bizCtx, AsyncContext asyncCtx, T request) {
		throw new RuntimeException(
				"Raft Server not support handleRequest(BizContext bizCtx, AsyncContext asyncCtx, T request) ");
	}

	@Override
	public Object handleRequest(BizContext bizCtx, T request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String interest() {
		return Request.class.getName();
	}

}
