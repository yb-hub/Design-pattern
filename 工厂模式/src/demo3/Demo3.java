package demo3;

import java.util.Scanner;

/**
 * @author yb
 * @description
 * @data 2020/4/23
 */
public class Demo3 {
    public static void main(String[] args) throws Exception {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int number1 = scanner.nextInt();
        System.out.println("请输入数字2");
        int number2 = scanner.nextInt();
        System.out.println("请输入操作");
        String operate = scanner.next();
        //如果这样的话，就不知道应该实例化哪个子类对象（可能是加法，也可能是减法。。。所以需要判断输入的操作类型来觉得生成什么子类对象）
        //就是使用switch case,但是不要写在这里，可以提取一个“工厂类”（用于生产特定子类）
//        AddCalculator addCalculator = new AddCalculator();
//        addCalculator.setNumber1(number1);
//        addCalculator.setNumber2(number2);
//        result = addCalculator.calculate();
        AbstractCalculator calculator = CalculatorFactory.getCalculator(operate);
        calculator.setNumber1(number1);
        calculator.setNumber2(number2);
        result =calculator.calculate();
        System.out.println(result);
    }
}
