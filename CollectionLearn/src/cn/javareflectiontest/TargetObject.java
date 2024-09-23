package cn.javareflectiontest;

/**
 * reflection test class, use reflection to get this method and parameter
 *
 * @author Siyuan
 * @Date 2024/9/23 10:57
 */
public class TargetObject {
    private String value;

    public TargetObject() {
        value = "JavaReflection";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
