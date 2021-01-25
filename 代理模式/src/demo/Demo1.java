package demo;

/**
 * @author yb
 * @description
 * @data 2020/4/26
 */
public class Demo1 {
    public static void main(String[] args) {
        NikeFactory nikeFactory = new NikeFactory();
        ProxyFactory proxyFactory = new ProxyFactory(nikeFactory);
        proxyFactory.Product();
    }
}
