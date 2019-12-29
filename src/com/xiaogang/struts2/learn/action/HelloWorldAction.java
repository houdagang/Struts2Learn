package com.xiaogang.struts2.learn.action;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ProjectName : Struts2Learn
 * @作者 : 侯小刚
 * @描述 : Hello World
 * @创建日期 : 2019/12/28 17:47
 */
public class HelloWorldAction extends ActionSupport implements Action {

    private String name;

    public String execute() throws Exception {
        System.out.println("Inside action....");
        if (!"SECRET".equals(name)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
