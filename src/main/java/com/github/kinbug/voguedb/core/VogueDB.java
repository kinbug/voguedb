/**
 * @project voguedb  V1.0
 * @filename: VogueConfig.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.core;

import java.io.InputStream;
import org.yaml.snakeyaml.Yaml;

/**
 * @ClassName: VogueConfig
 * @Description: TODO(启动类)
 * @author kinbug
 * @date 2020年7月31日
 */
public class VogueDB {

	private VogueConfig vogueConfig;
	
	/**
	 * @return the vogueConfig
	 */
	public VogueConfig getVogueConfig() {
		return vogueConfig;
	}

	/**
	 * @param vogueConfig the vogueConfig to set
	 */
	public void setVogueConfig(VogueConfig vogueConfig) {
		this.vogueConfig = vogueConfig;
	}

	/** 实例化 */
	public VogueDB() {
		InputStream stream = this.getClass().getClassLoader().getResourceAsStream("voguedb.yml");
		vogueConfig = new Yaml().loadAs(stream, VogueConfig.class);
	}

	/**
	 * @Title: start
	 * @Description: TODO(方法描述)
	 * @param  参数
	 * @return void 返回类型
	 * @throws
	 */
	public void start() {

	}
}
