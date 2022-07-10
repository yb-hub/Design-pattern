package demo1;

/**
 * @Author yb
 * @Description
 * @date 2022/7/10 4:39 PM
 */

public class FilterB extends BaseFilter {
    @Override
    public void doFilter(ClientRequest request) {
        System.out.println("this is filterB");
    }
}
