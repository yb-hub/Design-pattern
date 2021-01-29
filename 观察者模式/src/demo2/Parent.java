package demo2;

/**
 * @author yb
 * @description
 * @data 2021/1/25
 */
public class Parent implements Observer {
    private String name;

    public Parent(String name,Subject subject) {
        this.name = name;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(name+"Í£Ö¹³Ô¹Ï×Ó");
    }
}
