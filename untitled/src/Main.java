import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//        int n = 100;
//        int sum = (n + 1) * n / 2;
//        System.out.println(sum);
//        System.out.println(sum == 5050 ? "测试通过" : "测试失败");
/*
    浮点数运算
 */
//     double a = 1.0;
//     double b = 3f;
//     double c = -4f;
//     //  Math.sqrt(); 平方根
//     double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
//     double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
//     System.out.println(r1);
//     System.out.println(r2);
//     System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
/*
    布尔运算
*/
//        int age = 7;
//        boolean isPrimaryStudent = age >= 6 && age <= 12 ? true : false;
//        System.out.println(isPrimaryStudent ? "Yes" : "No");
/*
    字符和字符串
    char Unicode表示字符，占用两个字节。 使用''

    String是引用类型(不可变性，字符串内容不可变，但是变量指向可变——类似CPP指针)，用"..."表示字符串，转义字符\
    String指向null和空值""不一样，空字符串是一个有效的字符串对象，不等于null
    \n 换行  \r 回车  \t 表示tab   \ u####表示一个Unicode编码(空格去了)

    字符串连接 +

    JAVA13开始 """..."""表示多行字符串，如数据库SELECT语句
    """
    SELECT * FROM
        users
    WHERE id > 100
    ORDER BY name DESC
    """
    注意这是五行，DESC后还有一个\n换行符，如果不想就这么写-> ORDER BY name DESC"


 */
    //  理解String的不可变性和指向问题
//        String s = "hello";
//        String t = s;
//        s = "world";
//        System.out.println(t);  //  hello
//        System.out.println(s);  //  world

        /*
            数组类型（引用类型——类似CPP指针，改变指向不会改变原来的内容，索引越界运行时会报错）
            int[] array = new int[5];  //  定义直接初始化元素，编译器会自动推到数组大小。
            Java数组所有元素会初始化为默认值：0 0.0 false;数组一旦创建，大小不可变
            array.length  // 获取数组长度
            数组元素是引用类型，如String，修改数组就是改变其指向，原来的String字符串无法再通过数组下标索引获取
         */
//        String[] name = {"ABC", "XYZ", "ZOO"};
//        String s = name[1];
//        name[1] = "CAT";
//        System.out.println(s);  //  XYZ
        /*
        println打印输出并换行
        print打印输出
        printf格式化输出（占位符%?  like %.2f）
        格式化输入麻烦
         */
//        Scanner scanner = new Scanner(System.in);  // 创建Scanner对象
//        System.out.println("Input your name: ");  // 打印提示
//        String name = scanner.nextLine();  // 读取一行输入并获取字符串
//        System.out.print("Input your age: ");
//        int age = scanner.nextInt();  // 读取一行输入并获取整数
//        System.out.printf("Hi, %s, your are %d years old!", name, age);  // 格式化输出
        /*
            判断引用类型相等
            判断值类型是否相等可以使用==运算符，但是判断引用类型的变量是否相等，== 表示“引用是否相等”，或者是是否指向同一个对象（内容相同但是指向不一样还是false）
            equals()方法判断引用类型的变量内容是否相等（而不是指向相等）
            变量为空的时候使用equals会报NullPointerException，为了避免可以使用 && 运算符的短路特性 s1 != null && s1.equals("Hello")

            调用Arrays.sort()对数组元素为引用类型的数组进行排序后，改变的是指向，元素在内存中的位置没变
         */
//        int sum = 0;
//        int n = 0;
//        while (n < 100) {
//            n++;
//            sum = sum + n;
//        }
//        System.out.println(sum);
        //  注意报错是因为编译器默认编码是UTF-8而代码保存格式是GBK，修改一下就行（cmd查看chcp输出936->表示GBK编码）
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}