import java.util.*;

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
        // Map override hashCode
//        Student s = new Student("Xiao Ming", 90);
//        Map<String , Student> map = new HashMap<>();
//        map.put("Xiao Ming", s); // 将Xiao Ming和Student实例关联
//        Student target = map.get("Xiao Ming"); // 根据key查找
//        System.out.println(target == s); // true 同一个实例
//        System.out.println(target.score); // 90
//        Student another = map.get("Bob"); // 通过实例找另一个
//        System.out.println(another); // 未找到返回null
        // TreeMap 自定义类需要实现CompareTo(), (String Integer等自带)，不需要使用equals()和hashCode()，可以不override
        Map<Person, Integer> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        map.put(new Person("Tom"), 1);
        map.put(new Person("Bob"), 2);
        map.put(new Person("Lily"), 3);
        for (Person key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new Person("Bob"))); // 2

        Map<Student, Integer> map2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // return o1.score > o2.score ? -1 : 1; // 仅这句话没考虑相等的情况
                if (o1.score == o2.score) return 0; // map2.get(new Student("Bob", 66))返回不会是null而是2（正确结果）
                return o1.score > o2.score ? -1 : 1;
            }
        });
        map2.put(new Student("Tom", 77), 1);
        map2.put(new Student("Bob", 66), 2);
        map2.put(new Student("Lily", 99), 3);
        for (Student key : map2.keySet()) {
            System.out.println(key);
        }
        System.out.println(map2.get(new Student("Bob", 66))); // null 因为Comparator函数没有考虑到相等的情况，所以查不到
    }
}

