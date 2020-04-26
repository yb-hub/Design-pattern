package demo2;

/**
 * @author yb
 * @description 装饰类 将衣服，裤子，鞋子等统一继承这个装饰类
 * @data 2020/4/26
 */
public class Decorator implements Component{
    protected Component component;

    @Override
    public void show() {
        component.show();
    }
}
