package demo2;

/**
 * @author yb
 * @description
 * @data 2020/4/26
 */

/**
 * 需求：给一个人任意的搭配服装：衣服，裤子，帽子等。
 * 分析：如果每一种搭配都创建一个子类，会造成类爆炸
 * 处理：使用装饰器模式，把人当作被装饰类，服饰当作装饰类。为了使两者获取联系，就使他们继承与同一个接口或类。
 * 每次装饰一件物品，就把新的人（装饰着服饰的人）传入到下一个装饰类中。
 */
public class Demo2 {
    public static void main(String[] args) {
        Component people = new People();
        people.show();

        people = new Clothes(people);
        people.show();

        people = new Shoes(people);
        people.show();

        people = new Clothes(people);
        people.show();
    }
}
