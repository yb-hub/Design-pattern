package demo1;

/**
 * @author yb
 * @description 计算策略类
 * @data 2020/4/24
 */
public class CalculatorStrategy {
    private AbstractCalculator calculator;

    public CalculatorStrategy(AbstractCalculator calculator){
        this.calculator = calculator;
    }

    public CalculatorStrategy(String operate) throws Exception {
        this.calculator = CalculatorFactory.getCalculator(operate);
//        switch (operate){
//            case "+":
//                this.calculator = new AddCalculator();
//                break;s
//            case "*":
//                this.calculator = new MultiCalculator();
//                break;
//            default:
//                throw new Exception("非法字符");
//        }
    }

    public int calculate(int number1,int number2){
        calculator.setNumber1(number1);
        calculator.setNumber2(number2);
        return calculator.calculate();
    }

}
