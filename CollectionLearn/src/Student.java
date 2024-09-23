/**
 * @author Siyuan
 * @date 2024/09/17/16:08
 */
public class Student {
    public String name;
    public int score;

    public Student() {

    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String  toString() {
        return String.format("{%s: score = %d}", name, score);
    }
}
/**
 * Case uses for map study
 * Map<K, V>是一种键-值映射表，调用put(K key, V value)方法做映射，get(K key)通过key查找对应的value，查找不存在返回null
 * 如果只是判断key是否存在，调用boolean containsKey(K key)方法
 * Map中不存在重复的key，放入相同的key，只会把原有的key-value对应的value给替换掉；key不能重复，但是value可以重复(多对一映射)
 * Map存储不保证顺序，每一次遍历的输出顺序可能不一样！
 */
