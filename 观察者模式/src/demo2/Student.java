package demo2;

/**
 * @author yb
 * @description
 * @data 2021/1/25
 */
public class Student implements Observer {
    private String name;

    public Student(String name,Subject subject) {
        this.name = name;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(name+"Õ£÷π≥‘º¶Õ»");
    }
}
