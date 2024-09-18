import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List
//        List<Person> list = List.of(
//            new Person("Xiao", "Ming", 18),
//            new Person("Xiao", "Hong", 25),
//            new Person("Bob", "Smith", 20)
//        );
//        boolean exist = list.contains(new Person("Bob", "Smith", 20));
//        System.out.println(exist ? "test success!" : "test fail!");
        // Map
        Student s = new Student("Xiao Ming", 90);
        Map<String , Student> map = new HashMap<>();
        map.put("Xiao Ming", s); // 将Xiao Ming和Student实例关联
        Student target = map.get("Xiao Ming"); // 根据key查找
        System.out.println(target == s); // true 同一个实例
        System.out.println(target.score); // 90
        Student another = map.get("Bob"); // 通过实例找另一个
        System.out.println(another); // 未找到返回null
    }
}

