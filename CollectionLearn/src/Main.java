
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
//        Map<Person, Integer> map = new TreeMap<>(new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.name.compareTo(p2.name);
//            }
//        });
//        map.put(new Person("Tom"), 1);
//        map.put(new Person("Bob"), 2);
//        map.put(new Person("Lily"), 3);
//        for (Person key : map.keySet()) {
//            System.out.println(key);
//        }
//        System.out.println(map.get(new Person("Bob"))); // 2
//
//        Map<Student, Integer> map2 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                // return o1.score > o2.score ? -1 : 1; // 仅这句话没考虑相等的情况
//                if (o1.score == o2.score) return 0; // map2.get(new Student("Bob", 66))返回不会是null而是2（正确结果）
//                return o1.score > o2.score ? -1 : 1;
//            }
//        });
//        map2.put(new Student("Tom", 77), 1);
//        map2.put(new Student("Bob", 66), 2);
//        map2.put(new Student("Lily", 99), 3);
//        for (Student key : map2.keySet()) {
//            System.out.println(key);
//        }
//        System.out.println(map2.get(new Student("Bob", 66))); // null 因为Comparator函数没有考虑到相等的情况，所以查不到
//        Set<String> set = new HashSet<>();
//        set.add("apple");
//        set.add("banana");
//        set.add("orange");
//        set.add("pear");
//        for (String s : set) {
//            System.out.println(s);
//        }

        // Queue FIFO
//        Queue<String> queue = new LinkedList<>();
//        queue.offer("apple");
//        queue.offer("pear");
//        queue.offer("banana");
//        // 从队列取出元素,并删除:
//        System.out.println(queue.poll()); // apple
//        System.out.println(queue.poll()); // pear
//        System.out.println(queue.poll()); // banana
//        System.out.println(queue.poll()); // null,因为队列是空的
//        // peek()获取队首元素，但不会删除
//        System.out.println(queue.peek()); // apple
//        System.out.println(queue.peek()); // apple
//        System.out.println(queue.peek()); // apple
        // LinkedList实现了List和Queue的接口，面向抽象编程的原则

        // PriorityQueue: 放入元素必须实现Comparable接口，根据元素的排序来实现出队的优先级。如下String就是根据abcd顺序订优先级
//        Queue<String> q = new PriorityQueue<>();
//        q.offer("apple");
//        q.offer("orange");
//        q.offer("pear");
//        System.out.println(q.poll()); // apple
//        System.out.println(q.poll()); // orange
//        System.out.println(q.poll()); // pear
//        System.out.println(q.poll()); // null
        // 自定义类实现Comparable创建PriorityQueue,优先级队列的队首是优先级最高的元素
//        Queue<User> q = new PriorityQueue<>();
//        q.offer(new User("Bob", "A1"));
//        q.offer(new User("Alice", "A2"));
//        q.offer(new User("Boss", "V1"));
//        System.out.println(q.poll()); // Boss / V1
//        System.out.println(q.poll()); // Bob / A1
//        System.out.println(q.poll()); // Alice /A2
//        System.out.println(q.poll()); // null Queue now is empty
        /**
         * 在PriorityQueue的插入过程中，以下是compareTo方法可能被调用的几种情况:
         * 添加新元素：当你调用add(User u)或offer(User u)方法将一个新的User对象u添加到队列中时，PriorityQueue可能会将u与队列中的现有元素进行比较，以确定它在堆中的正确位置。
         * 在这个过程中，对于队列中的每个现有元素e，都可能会调用e.compareTo(u)（尽管实际上更可能是u.compareTo(e)，这取决于PriorityQueue的实现细节）。
         * 此时，this指的是队列中的现有元素e，而u1（在这个例子中，虽然方法参数被命名为u1，但在实际的compareTo调用中，它将是u）是新添加的元素。
         * 内部堆调整：当向PriorityQueue中添加新元素导致堆的性质被破坏时，队列内部会进行一系列的比较和元素移动来恢复堆的性质。
         * 在这个过程中，compareTo方法可能会被多次调用，以比较并重新排列元素。同样地，this和u1将分别代表正在进行比较的两个User对象。
         */

    }
}

