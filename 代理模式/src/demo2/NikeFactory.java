package demo2;

/**
 * @author yb
 * @description 被代理类
 * @data 2020/4/26
 */
public class NikeFactory implements Factory {
    @Override
    public void Product() {
        System.out.println("生产NIKE产品");
    }
}
