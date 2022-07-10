package demo1;

/**
 * @Author yb
 * @Description
 * @date 2022/7/10 4:43 PM
 */

public class Main {
    public static void main(String[] args) {

        BaseFilter baseFilter = new BaseFilter();

        ClientRequest clientRequest = new ClientRequest();
        clientRequest.setAge(18);
        baseFilter.doFilter(clientRequest);

    }
}
