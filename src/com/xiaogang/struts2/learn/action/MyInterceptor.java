package com.xiaogang.struts2.learn.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @ProjectName : Struts2Learn
 * @作者 : 侯小刚
 * @描述 : 自定义拦截器
 * @创建日期 : 2019/12/29 14:30
 */
public class MyInterceptor implements Interceptor {

    @Override
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public void init() {
        System.out.println("init");
    }

    public String intercept(ActionInvocation invocation)throws Exception{

        /* let us do some pre-processing */
        String output = "Pre-Processing";
        System.out.println(output);

        /* let us call action or next interceptor */
        String result = invocation.invoke();
        System.out.println(result);

        /* let us do some post-processing */
        output = "Post-Processing";
        System.out.println(output);

        return result;
    }

}
