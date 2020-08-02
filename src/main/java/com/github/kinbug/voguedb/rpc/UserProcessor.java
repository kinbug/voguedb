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
import com.github.kinbug.voguedb.enums.EnumReqType;
import com.github.kinbug.voguedb.rpc.entity.Request;
import com.github.kinbug.voguedb.rpc.entity.Response;

/**
 * @ClassName: UserProcessor
 * @Description: TODO(类描述)
 * @author kinbug
 * @date 2020年7月31日
 */
public class UserProcessor<T> extends AbstractUserProcessor<T> {

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

	
	public Response<?> handlerRequest(Request<?> request) {
        if (request.getEnumReqType() == EnumReqType.VOTE) {
        } else if (request.getEnumReqType() == EnumReqType.ENTRIES_ADD) {
        } else if (request.getEnumReqType() == EnumReqType.CLIENT_REQ) {
        } else if (request.getEnumReqType() == EnumReqType.CONFIG_REMOVE) {
        } else if (request.getEnumReqType() == EnumReqType.CONFIG_ADD) {
        }
        return null;
    }
}
