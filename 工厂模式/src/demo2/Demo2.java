package demo2;

import java.util.Scanner;

/**
 * @author yb
 * @description
 * @data 2020/4/23
 */
public class Demo2 {
    public static void main(String[] args) throws Exception {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int number1 = scanner.nextInt();
        System.out.println("请输入数字2");
        int number2 = scanner.nextInt();
        System.out.println("请输入操作");
        String operate = scanner.next();
        result = Calculator.calculate(number1, number2, operate);
        System.out.println(result);
    }
}
//如果此时要新增一个乘法的算法，如果以现在的方式的话，就需要把整个Calculator类给你，
//然后在类中新增一个判断方法，这样就会不安全（可能你一不小心或者故意修改了加法和减法的代码）
//所以应该抽象出一个计算器类，具体的计算方法需要继承这个类
