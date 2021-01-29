package demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yb
 * @description 通知者
 * @data 2021/1/25
 */
public interface Subject {
    /**
     * 新增观察者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
