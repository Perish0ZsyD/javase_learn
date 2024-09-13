//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Student("test", 12, 100);
        person.run();

//        System.out.printf("Hello and welcome!");

//            Person ming = new Person("ming", 15);
//            System.out.println("name: " + ming.getName() + " age: " + ming.getAge());

//  方法重载体验
//        String s = "Test string";
//        int n1 = s.indexOf('t');
//        int n2 = s.indexOf("st");
//        int n3 = s.indexOf("st", 4);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
    }
}

//  可变参数 类型...  定义，可变参数相当于数组类型，可变参数可以保证无法传入null，传入0个参数，接收到的实际值是一个空数组而不是null
class Group {
    private String[] names;
    String info;

    public Group (String[] names, String info) {
//        this.names = names; // 注意该方法是浅拷贝
        this.names = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            this.names[i] = names[i]; // 创造副本再赋值
        }

        this.info = info;
    }
    public void setNames(String... names) {  //  相当于String[] names，区别在于 调用方需要自己先构造String[]
        //  main函数调用方 Group g = new Group(); g.setNames(new String[] {" "}); 并且调用方可以传入Null
        //  String... names 调用方可以直接g.setNames("xxx");
        this.names = names;
    }
}

/*
    基本类型参数的传递，是调用方值的复制
    引用类型参数的传递，修改一方，另一方也会更改；引用类型传参的时候都是传内存地址，注意廖的方法最后一个问题
 */