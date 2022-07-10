package demo1;

/**
 * @Author yb
 * @Description
 * @date 2022/7/10 4:29 PM
 */

public class ClientRequest {
    private String name;
    private int age;
    /**
     * 请求内容
     */
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
