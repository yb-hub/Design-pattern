package demo1;

/**
 * @Author yb
 * @Description
 * @date 2022/7/10 4:33 PM
 */

public class FilterA extends BaseFilter{
    @Override
    public void doFilter(ClientRequest request) {
        System.out.println("this is filterA");
    }
}
