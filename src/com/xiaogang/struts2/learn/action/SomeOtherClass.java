package com.xiaogang.struts2.learn.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.HashMap;
import java.util.Map;

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
        ValueStack stack = ActionContext.getContext().getValueStack();
        Map<String, Object> context = new HashMap<String, Object>();

        context.put("key1", new String("This is key1"));
        context.put("key2", new String("This is key2"));
        stack.push(context);

        System.out.println("Size of the valueStack: " + stack.size());
        return MyAction.GOOD;
    }
}
