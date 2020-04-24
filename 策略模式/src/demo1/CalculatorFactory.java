package demo1;


/**
 * @author yb
 * @description 计算工厂类
 * @data 2020/4/23
 */
public class CalculatorFactory {
    public static AbstractCalculator getCalculator(String operate) throws Exception {
        AbstractCalculator calculator;
        switch (operate){
            case "+":
                calculator = new AddCalculator();
                break;
            case "*":
                calculator = new MultiCalculator();
                break;
            default:
                throw new Exception("非法字符");
        }
        return calculator;
    }
}
