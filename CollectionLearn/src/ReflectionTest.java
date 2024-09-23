/**
 * class for reflection test
 *
 * @author Siyuan
 * @Date 2024/9/23 11:58
 */

import cn.javareflectiontest.TargetObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import java.util.Arrays;



public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException{
        // Reflection test
//        Person p = new Person("xiao zhou");
//        Class alunbarClass = p.getClass();
//        System.out.println(alunbarClass); // 获取类
//        alunbarClass = alunbarClass.getSuperclass();
//        System.out.println(alunbarClass); // 获取类的父类
        Class studentClass =Student.class;
        Student s1 = (Student) studentClass.newInstance(); // 相当于无参

        // 构造方法的反射
        // 获取有参构造
        Constructor con = studentClass.getDeclaredConstructor(String.class, int.class);
        Student s2 = (Student) con.newInstance("张三", 90);
        Student s3 = (Student) con.newInstance("王五", 80);
        System.out.println(s2);
        System.out.println(con.getName()); // 获取构造方法的名称
        System.out.println(con.getParameterCount()); // 获取构造方法的参数数量
        System.out.println(Arrays.toString(con.getParameterTypes())); // 获取构造方法的参数类型

        /** output:
         *{张三: score = 90}
         * Student
         * 2
         * [class java.lang.String, int]
         */

        // 属性的反射
        /**
         * 关于修饰符的问题，在Java中如果修饰符不是public修饰的话，需要使用getDeclaredXxx(参数类型字节码文件 )，并且设置暴力破解的方式使用。
         * getDeclaredField(String name);                     获取域属性对象
         * getName()                                          获取属性名称
         * getType()                                          获取属性类型的字节码文件
         * setAccessible(true)                                设置暴力破解，获取对私有属性的使用
         * field.set(per, "huawei");                          相当于设置 per.name = "huawei"
         * String str = (String) field.get(per);              相当于 str = per.name
         */
//        Field field = studentClass.getDeclaredField("name");
//        field.setAccessible(true);
//        field.set(s2, "李四");
//        String str = (String) field.get(s2);
//        System.out.println(str); // 李四，而不是张三

        // 方法的反射
        /**
         * getDeclareMethod：可以获取类中声明的所有方法，包括公有方法、私有方法、受保护方法和包访问级别方法,如果指定的方法不存在，则会抛出 NoSuchMethodException 异常。
         * getDeclaredMethod 方法有两个参数：
         * -> name 表示要获取的方法的名称，类型为字符串。
         * -> parameterTypes 表示方法的参数类型，是一个可变参数。
         * getDeclaredMethod("charAt", int.class);                  获取方法对象 字符串String中charAt方法作用返回一个字符串的指定位置的字符，索引是从[0,length-1]
         * char c = (char) method.invoke("askdhjsad", 2);          调用方法，相当于 "askdhjsad".charAt(2);
         */
//        Class c1 = String.class;
//        Method method = c1.getDeclaredMethod("charAt", int.class);
//        char c = (char) method.invoke("askdhjsad", 2);
//        System.out.println(c);


        /**
         * 获取TargetObject类的class对象并且创建TargetObject类实例
         */
        Class<?> targetClass = Class.forName("cn.javareflectiontest.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance(); // newInstance()方法相当于无参构造，可以传入参数调用有参构造

        /**
         * 获取TargetObject类中定义的所有方法
         */
        Method[] methods = targetClass.getDeclaredMethods();
        System.out.println("methods :");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        /**
         * 获取指定方法并调用
         */
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod",
                String.class);
        publicMethod.invoke(targetObject, "JavaGuide");

        /**
         * 获取指定参数并对参数进行修改
         */
        Field field = targetClass.getDeclaredField("value");
        // 为了对类中参数进行修改我们取消安全检查
        field.setAccessible(true);
        field.set(targetObject, "JavaGuide");

        /**
         * 调用private方法
         */
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        // 为了调用private方法我们取消安全检查
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}
