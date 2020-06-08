package com.wq.api.service;

import com.wq.api.model.TestDubboData;

/**
 * @author wangqing
 * @Desc
 * @Date: 2020-06-08 19:04
 * @since 2020-6-8 19:04
 */
public interface TestDubboService {

    TestDubboData getTestDubboData(String uuid, String name);
}
