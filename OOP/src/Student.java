public class Student extends Person {
    protected int score;

    public Student (String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public void run() {
        System.out.println("Student run");  //  Override 覆写Person.run()方法 加@override编译器会帮助检查是否进行了正确的覆写
        /*
            方法名、方法参数相同但是方法返回值不同，也是不同方法。Java程序中出现这种情况，编译器会报错
            Java实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型——多态 Polymorphic
         */
    }
}

/*
    子类自动继承父类所有字段，严禁定义和父类重名的字段
    Person称为超类（super class）、父类（parent class）、基类（base class）
    Student称为子类（subclass）、扩展类（extended class）
    没有写extends的类，编译器默认加上extends Object。任何类除了Object都会继承自某个类
    Java规定一个class继承自一个类，因此一个类有且仅有一个父类（Object除外）——单继承，所有类最终的根类是Object

    protected让子类能访问父类的protected字段
    super让子类引用父类的字段，有的时候和this效果一样；编译器在构造，第一行必须是调用父类的构造方法super() <:编译器自动加上去>，父类如果没有super()这种无参构造方法,因此必须使用super(value1, value2...)来调用父类的某种构造方法
    ——>父类没有默认构造方法，子类必须显示调用super()并给出参数以便让编译器定位到父类一个合适的构造方法。
    ——>子类不会继承任何父类的构造方法，子类的默认构造方法是编译器自动生成的

    Java15  permits (允许继承)和 sealed（防止继承滥用）

    继承向上转型
    Student引用变量可以指向Student的一个实例， Person同理
    Person p = new Student(); 也是可以的，因为Student继承自Person，拥有Person的全部功能——>子类类型安全变为父类类型的赋值称为向上转型
    向下转型 Person->Student JVM可能会报ClassCastException，能不能转型成功，Java提供instanceof操作符<:判断变量所指向的实例是否是指定类型或者这个类型的子类，对于null的引用变量，结果都是false>
    可以先判断一个实例是不是某种类型: System.out.println(s instanceof Person); // 输出为布尔类型

    继承和组合的区别
    继承是is 组合是has
    组合可以在类里面定义另一个类的实例
 */
