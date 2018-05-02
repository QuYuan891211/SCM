package cn.qy.scm.entity;

import java.util.UUID;

public class Account {
   private String id;
    /* 管理员登录名  */
   private String loginName;
    /* 管理员姓名  */
   private String name;
    /* 管理员密码 */
   private String password;

    public Account() {
    }

    public Account(String loginName, String name, String password) {
        this.id = UUID.randomUUID().toString();
        this.loginName = loginName;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
