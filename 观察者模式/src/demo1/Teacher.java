package demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yb
 * @description
 * @data 2021/1/25
 */
//领导检测，老师望风，领导来时，通知学生停止吃鸡腿
public class Teacher {
    private String name;
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void notifyStudent(){
        for (Student student : studentList) {
            student.stopEat();
        }
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("A");
        Student studentA = new Student("a",teacher);
        Student studentB = new Student("b", teacher);
        System.out.println("领导来啦！");
        teacher.notifyStudent();
    }
}
