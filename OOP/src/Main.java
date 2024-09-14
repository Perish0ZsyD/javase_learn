////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) throws Exception{
////        Person person = new Student("test", 12, 100);
////        person.run();
//
////        System.out.printf("Hello and welcome!");
//
////            Person ming = new Person("ming", 15);
////            System.out.println("name: " + ming.getName() + " age: " + ming.getAge());
//
////  方法重载体验
////        String s = "Test string";
////        int n1 = s.indexOf('t');
////        int n2 = s.indexOf("st");
////        int n3 = s.indexOf("st", 4);
////        System.out.println(n1);
////        System.out.println(n2);
////        System.out.println(n3);
//
//        // exception test
//        Exception origin = null;
//        try {
//            System.out.println(Integer.parseInt("abc"));
//        } catch (Exception e) {
//            origin = e;
//            throw e;
//        } finally {
//            Exception e = new IllegalArgumentException();
//            if (origin != null) {
//                e.addSuppressed(origin); // 当catch和finally都抛出了异常时，虽然catch的异常被屏蔽了，但是，finally抛出的异常仍然包含了它
//            }
//            throw e;
//        }
//
//
////        Exceptiontest et = new Exceptiontest();
////        try {
////            et.process1();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//        /*
//        输出 一个方法捕获了某个异常后，又在catch子句中抛出新的异常，就相当于把抛出的异常类型“转换”了
//        java.lang.IllegalArgumentException
//	        at Exceptiontest.process1(Exceptiontest.java:6)
//	        at Main.main(Main.java:25)
//	     说明新的异常丢失了原始异常信息，我们已经看不到原始异常NullPointerException的信息了；
//	     为了能追踪到完整的异常栈，在构造异常的时候，把原始的Exception实例传进去，新的Exception就可以持有原始Exception信息
//	     java.lang.IllegalArgumentException: java.lang.NullPointerException
//	        at Exceptiontest.process1(Exceptiontest.java:7)
//	        at Main.main(Main.java:25)
//        Caused by: java.lang.NullPointerException  // 说明IllegalArgumentException不是造成问题的根源，根源是NullPointerException，在Main.process2()方法抛出
//	        at Exceptiontest.process2(Exceptiontest.java:12)
//	        at Exceptiontest.process1(Exceptiontest.java:4)
//	... 1 more
//         */
//    }
//}
//
////  可变参数 类型...  定义，可变参数相当于数组类型，可变参数可以保证无法传入null，传入0个参数，接收到的实际值是一个空数组而不是null
//class Group {
//    private String[] names;
//    String info;
//
//    public Group (String[] names, String info) {
////        this.names = names; // 注意该方法是浅拷贝
//        this.names = new String[names.length];
//        for (int i = 0; i < names.length; i++) {
//            this.names[i] = names[i]; // 创造副本再赋值
//        }
//
//        this.info = info;
//    }
//    public void setNames(String... names) {  //  相当于String[] names，区别在于 调用方需要自己先构造String[]
//        //  main函数调用方 Group g = new Group(); g.setNames(new String[] {" "}); 并且调用方可以传入Null
//        //  String... names 调用方可以直接g.setNames("xxx");
//        this.names = names;
//    }
//}
//
///*
//    基本类型参数的传递，是调用方值的复制
//    引用类型参数的传递，修改一方，另一方也会更改；引用类型传参的时候都是传内存地址，注意廖的方法最后一个问题
// */

//public class Main {
//    public static void main(String[] args) {
////        String a = "test";
////        assert isUp(a) : "is not up!!" ;
////
////    }
////    public static boolean isUp(String a) {
////        return false;
////    }
//
//        try {
//            methodThatThrows();
//        } catch (Exception e) {
//            e.printStackTrace();
//            // 打印被抑制的异常
//            for (Throwable suppressed : e.getSuppressed()) {
//                suppressed.printStackTrace();
//            }
//        }
//    }
//
//    public static void methodThatThrows() throws Exception {
//        try {
//            // 假设这里发生了一个异常
//            throw new Exception("First Exception");
//        } catch (Exception e) {
//            try {
//                // 在处理第一个异常时，又发生了另一个异常
//                throw new Exception("Second Exception");
//            } catch (Exception e2) {
//                // 创建一个新的异常，并将e2作为被抑制的异常添加
////                Exception newException = new Exception("Main Exception");  // 最新的异常，把前两个抑制了
////                newException.addSuppressed(e);
////                newException.addSuppressed(e2);
////                throw newException;
//                System.out.println("e2 exception");
//            }
//        }
//    }
//}

/*
    java.lang.Exception: Main Exception
	at Main.methodThatThrows(Main.java:111)
	at Main.main(Main.java:91)
	Suppressed: java.lang.Exception: First Exception
		at Main.methodThatThrows(Main.java:104)
		... 1 more
	Suppressed: java.lang.Exception: Second Exception
		at Main.methodThatThrows(Main.java:108)
		... 1 more
java.lang.Exception: First Exception
	at Main.methodThatThrows(Main.java:104)
	at Main.main(Main.java:91)
java.lang.Exception: Second Exception
	at Main.methodThatThrows(Main.java:108)
	at Main.main(Main.java:91)

	注释两个被抑制的异常
	java.lang.Exception: Main Exception
	at Main.methodThatThrows(Main.java:111)
	at Main.main(Main.java:91)

 */

// 反射测试
public class Main {
    public static void main(String[] args) {
        Reflectiontest re = new Reflectiontest();
        re.test();
    }
}