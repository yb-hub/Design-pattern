package demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yb
 * @description ֪ͨ��
 * @data 2021/1/25
 */
public interface Subject {
    /**
     * �����۲���
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * ɾ���۲���
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * ֪ͨ�۲���
     */
    void notifyObserver();
}
