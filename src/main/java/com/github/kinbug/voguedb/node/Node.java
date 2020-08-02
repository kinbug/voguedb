package com.github.kinbug.voguedb.node;

/**
 *
 * @author 莫那·鲁道
 */
public interface Node<T> extends LifeCycle{

    /**
     * 设置配置文件.
     *
     * @param config
     */
    void setConfig(NodeConfig config);

    /**
     * 处理请求投票 RPC.
     *
     * @param param
     * @return
     */
    VoteResult handlerRequestVote(VoteParam param);

    /**
     * 处理附加日志请求.
     *
     * @param param
     * @return
     */
   // AentryResult handlerAppendEntries(AentryParam param);

    /**
     * 处理客户端请求.
     *
     * @param request
     * @return
     */
   // ClientKVAck handlerClientRequest(ClientKVReq request);

    /**
     * 转发给 leader 节点.
     * @param request
     * @return
     */
  //  ClientKVAck redirect(ClientKVReq request);

}
