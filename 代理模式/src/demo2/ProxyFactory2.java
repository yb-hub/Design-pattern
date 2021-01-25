package demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yb
 * @description 静态代理类
 * @data 2020/4/26
 */
public class ProxyFactory2 {

    //根据被代理类获取代理类
    public static Object getProxyFactory(Object obj){
        MyInvocationHandler handler = new MyInvocationHandler(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}
class MyInvocationHandler implements InvocationHandler {
    private Object obj; //被代理类对象

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始准备工作");
        Object invoke = method.invoke(obj, args);  //调用被代理类obj中的方法
        System.out.println("开始结束工作");
        return invoke;
    }
}