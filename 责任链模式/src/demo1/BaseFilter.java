package demo1;

/**
 * @Author yb
 * @Description
 * @date 2022/7/10 4:27 PM
 */

public class BaseFilter {

    public void doFilter(ClientRequest request){
        //如果年龄小于10岁，则A处理
        if(request.getAge() < 10){
            FilterA filterA = new FilterA();
            filterA.doFilter(request);
            System.out.println("filterA handle success!");
        }
        //如果年龄小于20岁，则B处理(A无法处理)
        if(request.getAge() > 10 && request.getAge() < 20){
            FilterB filterB = new FilterB();
            filterB.doFilter(request);
            System.out.println("filterB handle success!");
        }
        //如果年龄大于20岁，则C处理(B也无法处理)
        if(request.getAge() > 20 ){
            FilterC filterC = new FilterC();
            filterC.doFilter(request);
            System.out.println("filterC handle success!");
        }
    };
}
