package demo1;

/**
 * @author yb
 * @description
 * @data 2022/6/27
 */
public class Main {
    public static void main(String[] args) {
        BobPaper bobPaper = new BobPaper();
        JackPaper jackPaper = new JackPaper();
        //此处的打印方法是子类中的方法，其实除了每个题目的answer不同外，其余的都是相同的，都可以提取到父类
        bobPaper.printPaper();
        jackPaper.printPaper();
    }
}
