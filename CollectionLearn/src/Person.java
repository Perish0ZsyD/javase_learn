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

    public boolean equals(Object o) {
        // Person类有许多引用的情况采用Objects.equals()静态方法来进行equals覆写
        if (o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(this.firstName, p.firstName) && Objects.equals(this.secondName, p.secondName) && this.age == p.age;
        }
        return  false;
    }
}