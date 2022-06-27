package demo2;

/**
 * @author yb
 * @description
 * @data 2022/6/27
 */
public class JackPaper extends Paper {
    public JackPaper() {
        this.setName("Jack");
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
