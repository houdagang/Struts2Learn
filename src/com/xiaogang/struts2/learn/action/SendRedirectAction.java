package com.xiaogang.struts2.learn.action;

import com.opensymphony.xwork2.Action;

/**
 * @ProjectName : Struts2Learn
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2019/12/29 21:17
 */
public class SendRedirectAction implements Action {

    private String name;
    public String execute() {
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
