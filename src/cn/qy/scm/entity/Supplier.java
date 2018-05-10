package cn.qy.scm.entity;

import java.sql.Struct;
import java.util.UUID;

public class Supplier {
    private String id;
    private String name;
    private String linkman;
    private String phone;
    private String address;
    private String remark;

    public Supplier() {
    }

    public Supplier(String name, String linkman, String phone, String address, String remark) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.linkman = linkman;
        this.phone = phone;
        this.address = address;
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setUUID(){
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
