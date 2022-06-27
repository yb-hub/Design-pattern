package demo2;

/**
 * @author yb
 * @description
 * @data 2022/6/27
 */
public class Main {
    public static void main(String[] args) {
        BobPaper bobPaper = new BobPaper();
        JackPaper jackPaper = new JackPaper();
        //父类使用一个空方法，具体方法由子类实现，所有重复代码上升到父类，即为模板模式。
        bobPaper.printPaper();
        jackPaper.printPaper();
    }
}
