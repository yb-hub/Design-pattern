package demo2;

/**
 * @author yb
 * @description 计算器类
 * @data 2020/4/23
 */
public class Calculator {
    public static int calculate(int number1,int number2,String operator) throws Exception {
        int result;
        switch (operator){
            case "+":
                result = number1+number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            default:
                throw new Exception("非法字符");
        }
        return result;
    }
}
