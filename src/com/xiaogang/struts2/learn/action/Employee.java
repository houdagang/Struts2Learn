package com.xiaogang.struts2.learn.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ProjectName : Struts2Learn
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/1/1 23:33
 */
public class Employee extends ActionSupport {

    private String name;
    private int age;

    public String execute() {
        return SUCCESS;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void validate() {
        if (null == name || name.trim().equals("")) {
            addFieldError("name","The name is required");
        }
        if (age < 28 || age > 65) {
            addFieldError("age","Age must be in between 28 and 65");
        }
    }
}
