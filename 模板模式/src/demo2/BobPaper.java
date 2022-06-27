package demo2;

/**
 * @author yb
 * @description
 * @data 2022/6/27
 */
public class BobPaper extends Paper {
    public BobPaper() {
        this.setName("Bob");
    }
    @Override
    void printAnswer1(){
        System.out.println("Answer1:A");
    }

    @Override
    void printAnswer2(){
        System.out.println("Answer2:B");
    }

    @Override
    void printAnswer3(){
        System.out.println("Answer3:C");
    }
}
