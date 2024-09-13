public class PrimaryStudent extends Student {
    protected int grade;

    PrimaryStudent (String name, int age, int score, int grade) {
        super(name, age, score);
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }
}

/*
    Object方法有几个重要方法：
        toString() : 把instance输出为String
        equals() : 判断两个instance是否逻辑相等
        hashCode() : 计算一个instance的哈希值
        Person类进行覆写
    final修饰的方法不能被Override，修饰的类不能被继承，修饰的实例字段，在初始化后不能被修改（在构造方法中初始化final字段）

    在定义方法的时候必须实现方法的语句， 除非声明为抽象方法 public abstract .... (本身没有任何实现方法的语句，无法执行，包含抽象方法的类无法实例化，同时也要把类声明为抽象类abstract class Person
    抽象类本身被设计成只能用于被继承，强制子类实现其抽象方法（否则编译器报错），相当于一种“规范”

    面向抽象编程：引用高层类型，避免引用实际子类型的方式（高层也就是父类，上层代码只定义规范，不需要子类就可以实现业务逻辑，具体的业务逻辑由不同的子类实现，调用者并不关心）

    在抽象类中，抽象方法本质上是定义接口规范：即规定高层类的接口，从而保证所有子类都有相同的接口实现。如果一个抽象类没有字段，所有方法全部都是抽象方法，就可以把该抽象类改写为接口：interface （声明一个接口）
    interface Person { ... }  <抽象类不能定义实例字段（看廖3.1.7对比），方法默认都是public abstract （可以省略）。当一个具体的class去实现一个interface，需要使用implements关键字
    一个类只能继承自另一个类，不能从多个类继承，但是可以实现多个interface。一个interface可以继承自另一个interface，使用extends，相当于扩展接口方法

    设计思路：
        公共逻辑适合放在abstract class，具体逻辑放到各个子类
        接口层次代表抽象程度。
     在使用时，实例化的对象永远只能是某个具体的子类，但总是通过接口去引用它，因为接口比抽象类更抽象
     Java集合由两大接口派生（Collection<存放单一元素，子接口List、Set、Queue>和Map<存放键值对>）
     List list = new ArrayList(); // 用List接口引用具体子类的实例

    实现类可以不必覆写default方法。default方法的目的是，当我们需要给接口新增一个方法时，会涉及到修改全部子类。如果新增的是default方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法。
    default方法和抽象类的普通方法是有所不同的。因为interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段。
 */