package com.wq.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wq.api.model.TestDubboData;
import com.wq.api.service.TestDubboService;

/**
 * @author wangqing
 * @Desc
 * @Service(version = “${provider.service.version}”)
 * 这个注释，表示这是个dubbo的接口实现类，@Service注解是属于dubbo的，包是：org.apache.dubbo.config.annotation.Service
 * 其中的version = “${provider.service.version}” 表示接口的版本，在配置文件中配置的。
 * @Date: 2020-06-08 19:06
 * @since 2020-6-8 19:06
 */
@Service(version = "${provider.service.version}")
public class TestDubboServiceImp implements TestDubboService {
    @Override
    public TestDubboData getTestDubboData(String uuid, String name) {
        TestDubboData td = new TestDubboData();
        td.setId(uuid);
        td.setName(name);
        td.setTime(System.currentTimeMillis());
        td.setDes("这是一个测试接口，你测试成功了");
        td.setData("您好，"+name+"，这是您访问的数据！！！");
        return td;
    }
}
