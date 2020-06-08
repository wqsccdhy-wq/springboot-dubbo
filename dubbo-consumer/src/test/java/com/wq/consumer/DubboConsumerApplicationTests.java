package com.wq.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.wq.api.model.TestDubboData;
import com.wq.api.service.TestDubboService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DubboConsumerApplicationTests {

	@Reference(version = "${provider.service.version}")
	TestDubboService testDubboService;

	@Test
	void contextLoads() {
		TestDubboData data = testDubboService.getTestDubboData("1111", "试试");
		String jsonString = JSON.toJSONString(data, SerializerFeature.WriteMapNullValue);
		System.out.println(jsonString);
	}

}
