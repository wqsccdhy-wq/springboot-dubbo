package com.wq.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wq.api.model.TestDubboData;
import com.wq.api.service.TestDubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqing
 * @Desc
 * @Date: 2020-06-08 19:15
 * @since 2020-6-8 19:15
 */
@RestController
public class TestController {

    @Reference(version = "${provider.service.version}")
    TestDubboService testDubboService;

    @RequestMapping("/test")
    public TestDubboData test(String uuid, String name){
        TestDubboData test = testDubboService.getTestDubboData(uuid,name);
        return test;
    }

}
