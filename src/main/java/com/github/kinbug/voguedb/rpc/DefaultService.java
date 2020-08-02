/**
 * @project voguedb  V1.0
 * @filename: DefaultService.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.rpc;

import com.alipay.remoting.BizContext;
import com.alipay.remoting.rpc.RpcServer;
import com.github.kinbug.voguedb.rpc.entity.Request;
import com.github.kinbug.voguedb.rpc.entity.Response;

/**
 * @ClassName: DefaultService
 * @Description: TODO(类描述)
 * @author kinbug
 * @date 2020年7月31日
 */
public class DefaultService implements Server {

	// 保证只初始化一次
	private volatile boolean flag;

	private RpcServer rpcServer;

	public DefaultService() {
		if (flag) {
			return;
		}
		synchronized (this) {
			if (flag) {
				return;
			}
			rpcServer = new com.alipay.remoting.rpc.RpcServer(8080, false, false);
			rpcServer.registerUserProcessor(new UserProcessor<Request<?>>());
			// this.node = node;
			flag = true;
		}
	}

	@Override
	public void start() {
		rpcServer.start();
	}

	@Override
	public void stop() {
		rpcServer.stop();
	}

	@Override
	public Response<?> handlerRequest(Request<?> request) {
		// TODO Auto-generated method stub
		return null;
	}

}
