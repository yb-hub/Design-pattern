package demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yb
 * @description
 * @data 2021/1/25
 */
public class TeacherBoss implements Subject {
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
}
