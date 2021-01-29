package demo1;

/**
 * @author yb
 * @description
 * @data 2021/1/25
 */
public class Student {
    private String name;
    private Teacher teacher;

    public void eat(){
        System.out.println(name+"¿ªÊ¼³Ô¼¦ÍÈ");
    }

    public void stopEat(){
        System.out.println(name+"Í£Ö¹³Ô¼¦ÍÈ");
    }

    public Student(String name,Teacher teacher) {
        this.name = name;
        this.teacher =  teacher;
        teacher.addStudent(this);
        eat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
