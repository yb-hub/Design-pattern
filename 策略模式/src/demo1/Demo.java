package demo1;

import java.util.Scanner;

/**
 * @author yb
 * @description
 * @data 2020/4/24
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int number1 = scanner.nextInt();
        System.out.println("请输入数字2");
        int number2 = scanner.nextInt();
        System.out.println("请输入操作");
        String operate = scanner.next();
        //AbstractCalculator calculator = CalculatorFactory.getCalculator(operate);
        //根据operate找出特定的calculator，可以使用工厂模式
        //此处假设一个 new AddCalculator
        CalculatorStrategy calculatorStrategy = new CalculatorStrategy(new AddCalculator());
        result =calculatorStrategy.calculate(number1,number2);
        System.out.println(result);
    }
}
