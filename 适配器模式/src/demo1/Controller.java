package demo1;

/**
 * @author yb
 * @description
 * @data 2021/1/26
 */
public class Controller {
    public static void main(String[] args) {
        //暴露eat接口，需封装第三方的eatSomething接口
        Adapter adapter = new Adapter();
        adapter.eat();
    }
}
