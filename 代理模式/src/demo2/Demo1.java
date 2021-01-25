package demo2;

/**
 * @author yb
 * @description
 * @data 2020/4/26
 */
public class Demo1 {
    public static void main(String[] args) {
        LiNingFactory liNing = new LiNingFactory();
        NewFactory proxyFactory = (NewFactory) ProxyFactory2.getProxyFactory(liNing); //获取被代理类
        proxyFactory.Product();

        NikeFactory nike = new NikeFactory();
        Factory proxyFactory1 = (Factory) ProxyFactory2.getProxyFactory(nike);
        proxyFactory1.Product();
    }
}
