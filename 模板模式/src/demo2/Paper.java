package demo2;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author yb
 * @description
 * @data 2022/6/27
 */
public class Paper {
    private String name;
    void printQuestion1(){
        System.out.println("question1...A:**** B:**** C:****");
    }
    void printQuestion2(){
        System.out.println("question2...A:**** B:**** C:****");
    }
    void printQuestion3(){
        System.out.println("question3...A:**** B:**** C:****");
    }
    void printAnswer1(){}
    void printAnswer2(){}
    void printAnswer3(){}
    void printPaper(){
        System.out.println("====="+this.name+"=====");
        printQuestion1();
        printAnswer1();
        printQuestion2();
        printAnswer2();
        printQuestion3();
        printAnswer3();
    }

    public Paper() {
    }

    public Paper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
