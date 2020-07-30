/**
 * @project voguedb  V1.0
 * @filename: RandomUtils.java 2020年7月25日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.util;

import java.util.Random;

import com.github.kinbug.voguedb.paxos.Common;

/**
 * @ClassName: RandomUtils
 * @Description: TODO(类描述)
 * @author kinbug
 * @date 2020年7月25日
 */
public class RandomUtils {

	public static int randomAcceptorId() {
		Random random = new Random();
		int id = random.nextInt(Common.ACCEPTOR_COUNT) + 1;
		return id;
	}

	public static int randomProposerId() {
		Random random = new Random();
		int id = random.nextInt(Common.PROPOSER_COUNT) + 1;
		return id;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			randomProposerId();
		}
	}
}
