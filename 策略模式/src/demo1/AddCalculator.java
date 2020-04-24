package demo1;

/**
 * @author yb
 * @description
 * @data 2020/4/23
 */
public class AddCalculator extends AbstractCalculator {
    @Override
    public int calculate() {
        return super.getNumber1()+super.getNumber2();
    }
}
