package com.xiaogang.struts2.learn.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ProjectName : Struts2Learn
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2019/12/28 21:52
 */
class MyAction extends ActionSupport {
    public static String GOOD = SUCCESS;
    public static String BAD = ERROR;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SomeOtherClass extends MyAction {
    public String execute() {
        return MyAction.GOOD;
    }
}
