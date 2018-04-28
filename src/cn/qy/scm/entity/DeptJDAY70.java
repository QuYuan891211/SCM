package cn.qy.scm.entity;

import java.io.Serializable;
import java.util.UUID;

public class DeptJDAY70 implements Serializable {
    private String id;
    private String name;
    private Integer phoneNum;

    public DeptJDAY70() {
    }

    public DeptJDAY70(String name, Integer phoneNum) {
        this.id = UUID.randomUUID().toString().substring(0,9);
        this.name = name;
        this.phoneNum = phoneNum;
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

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }
}
