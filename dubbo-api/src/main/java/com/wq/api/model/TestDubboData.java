package com.wq.api.model;

import java.io.Serializable;

/**
 * @author wangqing
 * @Desc
 * @Date: 2020-06-08 19:02
 * @since 2020-6-8 19:02
 */
public class TestDubboData implements Serializable {

    String id;
    String name;
    String data;
    Long time;
    String des;

    public TestDubboData(){

    }

    public TestDubboData(String id, String name, String data, Long time, String des) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.time = time;
        this.des = des;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
