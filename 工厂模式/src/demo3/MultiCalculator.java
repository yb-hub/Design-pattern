package demo3;

/**
 * @author yb
 * @description 乘法计算器
 * @data 2020/4/23
 */
public class MultiCalculator extends AbstractCalculator {
    @Override
    public int calculate() {
        return super.getNumber1() * super.getNumber2();
    }
}
