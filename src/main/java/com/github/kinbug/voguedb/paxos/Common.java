/**
 * @project voguedb  V1.0
 * @filename: Common.java 2020年7月25日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.paxos;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: Common
 * @Description: TODO(公有的数据类)
 * @author DKE
 * @date 2020年7月25日
 */
public class Common {
	/**
	 * -> 提交者数量
	 */
	public static final int PROPOSER_COUNT = 2;

	/**
	 * -> 接受者数量
	 */
	public static final int ACCEPTOR_COUNT = 3;

	/**
	 * -> 全局提案编号（初始值为1）
	 */
	public static AtomicInteger proposerN = new AtomicInteger(0);
}
