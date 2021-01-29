package demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yb
 * @description
 * @data 2021/1/25
 */
public class Teacher implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        TeacherBoss teacherBoss = new TeacherBoss();
        Student a = new Student("a", teacher);
        Parent b = new Parent("b", teacherBoss);
        System.out.println("领导来了");
        teacher.notifyObserver();
        teacherBoss.notifyObserver();
    }
}
