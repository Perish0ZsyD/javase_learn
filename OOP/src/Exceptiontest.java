public class Exceptiontest {
    static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
//            throw new IllegalArgumentException();
            throw new IllegalArgumentException(e);  // 原始exception实例传入，记录原始exception信息
        }
    }

    static void process2() {
        throw new NullPointerException();
    }
}

