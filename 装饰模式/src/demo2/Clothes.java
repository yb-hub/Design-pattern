package demo2;

/**
 * @author yb
 * @description 衣服类
 * @data 2020/4/26
 */
public class Clothes extends Decorator {
    private Component component;

    /**
     * 传入一个装饰后的对象
     * @param component
     */
    public Clothes(Component component){
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
        System.out.println("穿上了衣服");
    }
}
