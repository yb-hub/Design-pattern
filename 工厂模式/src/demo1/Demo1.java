package demo1;

import java.util.Scanner;

/**
 * @author yb
 * @description 简单的计算器
 * @data 2020/4/23
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int number1 = scanner.nextInt();
        System.out.println("请输入数字2");
        int number2 = scanner.nextInt();
        System.out.println("请输入操作");
        String operate = scanner.next();
        switch (operate){
            case "+":
                result = number1+number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            default:
                throw new Exception("非法字符");
        }
        System.out.println(result);
    }
}
//此时的业务端和界面端逻辑都在一起，不易维护，可以封装出一个方法，或者一个类。