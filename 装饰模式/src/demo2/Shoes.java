package demo2;

/**
 * @author yb
 * @description 鞋子类
 * @data 2020/4/26
 */
public class Shoes extends Decorator  {

    private Component component;

    /**
     * 传入一个装饰后的对象
     * @param component
     */
    public Shoes(Component component){
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
        System.out.println("我穿上了鞋子");
    }
}
