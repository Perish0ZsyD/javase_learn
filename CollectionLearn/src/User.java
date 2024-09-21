public class User implements Comparable<User> {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " / " + number;
    }

    @Override
    public int compareTo(User u1) {
        if (this.number.charAt(0) == u1.number.charAt(0)) {
            // 如果两个人都是A开头或者V开头，比较号大小
            return this.number.compareTo(u1.number);
        }
        if (this.number.charAt(0) == 'V') {
            // 号码是V开头，优先级高
            return -1; // 当前对象优先级更高，那么则返回一个复数，PriorityQueue默认小顶堆
            // 如果compareTo方法返回一个负数，那么表示当前对象（this）在排序顺序中应该位于比较对象（other）之前。
            /**
             * u1是compareTo方法的参数，它是一个User类型的对象，代表与this对象进行比较的另一个User对象。
             * 在PriorityQueue的上下文中，u1可能是队列中已经存在的某个元素，或者是在添加新元素时与当前元素进行比较的候选元素。
             */
        } else {
            return 1;
        }
    }
}