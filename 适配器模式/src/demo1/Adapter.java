package demo1;

import javax.lang.model.element.VariableElement;

/**
 * @author yb
 * @description   ≈‰∆˜
 * @data 2021/1/26
 */
public class Adapter {
    private ThirdInterface thirdInterface = new ThirdInterface();
    public void eat(){
        thirdInterface.eatSomething();
    }
}
