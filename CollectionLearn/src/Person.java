import java.util.Objects;

/**
 * @author Siyuan
 * @date 2024/09/17/15:57
 */
class Person {
    String firstName;
    String secondName;
    int age;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // Person类有许多引用的情况采用Objects.equals()静态方法来进行equals覆写
        if (o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(this.firstName, p.firstName) && Objects.equals(this.secondName, p.secondName) && this.age == p.age;
        }
        return  false;
    }

    @Override
    public int hashCode() {
        // 正确实现自定义类的hashCode()
        int h = 0;
//        h = 31 * h + firstName.hashCode(); // 使用31 * h目的是为了把不同实例Person的hashCode分布到整个int范围，就是防止碰撞
//        h = 31 * h + secondName.hashCode(); // 如果firstName是null，则会报错NullPointerException
//        h = 31 * age; // 借助Objects.hah()解决上述问题
//        return h;
        return Objects.hash(firstName, secondName);
        // equals用到的比较每一个字段都必须在hashCode中用于计算，equals没有用到的字段，绝不可放在hashCode中计算。
        // HashMap用拉链法解决哈希冲突（key不同但是hashCode相同的情况）并根据key来返回正确的value
    }
}