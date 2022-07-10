package demo1;

/**
 * @author yb
 * @description 将已经存在的不匹配的接口，创建一个适配器封装起来，创建一个匹配的接口，内部调用原先的接口
 * 这样就可以在不修改原接口的情况下完成复用
 * @data 2021/1/26
 */
public class Controller {
    public static void main(String[] args) {
        //暴露eat接口，需封装第三方的eatSomething接口
        Adapter adapter = new Adapter();
        adapter.eat();
    }
}
