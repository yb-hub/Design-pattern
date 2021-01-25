package demo2;

/**
 * @author yb
 * @description
 * @data 2020/4/26
 */
class LiNingFactory implements NewFactory{

    @Override
    public void Product() {
        System.out.println("生产LiNing产品");
    }
}