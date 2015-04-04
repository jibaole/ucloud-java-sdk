package com.xiaoleilu.ucloud.test;

import org.junit.Test;
import org.slf4j.Logger;

import com.xiaoleilu.hutool.Log;
import com.xiaoleilu.ucloud.core.Response;
import com.xiaoleilu.ucloud.umon.UMon;

/**
 * 云监控 测试类
 * @author Looly
 *
 */
public class UMonTest {
	private final static  Logger log = Log.get();
	
	private final UMon uMon = new UMon();
	
	@Test
	public void sendSmdTest(){
		Response resp = uMon.sendSms("测试短信 from ucloud", "18847336369");
		log.debug("Junit: {}", resp.toPretty());
	}
}