package demo;

/**
 * @author yb
 * @description 静态代理类
 * @data 2020/4/26
 */
public class ProxyFactory implements Factory{

    private Factory factory;

    public ProxyFactory(Factory factory) {
        this.factory = factory;
    }
    @Override
    public void Product() {
        System.out.println("准备一些生产NIKE产品的材料");
        factory.Product(); //调用的是被代理类的方法
        System.out.println("处理一下生产后的事情");
    }
}