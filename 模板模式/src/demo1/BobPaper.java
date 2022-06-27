package demo1;

/**
 * @author yb
 * @description
 * @data 2022/6/27
 */
public class BobPaper extends Paper {
    void printAnswer1(){
        System.out.println("Answer1:A");
    }
    void printAnswer2(){
        System.out.println("Answer2:B");
    }
    void printAnswer3(){
        System.out.println("Answer3:C");
    }
    void printPaper(){
        System.out.println("=====BobPaper=====");
        printQuestion1();
        printAnswer1();
        printQuestion2();
        printAnswer2();
        printQuestion3();
        printAnswer3();
    }
}
