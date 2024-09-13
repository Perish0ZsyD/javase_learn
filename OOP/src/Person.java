class Person {
    protected String name;
    protected int age;
//    private int birth;

    public Person() {
        //  default constructor
        /*
           用户自定义构造方法后，需要显示写出默认构造方法
           没有构造方法中初始化字段，引用类型的字段默认是null，数值类型的字段用默认值， int类型默认值是0，布尔类型默认值是false
           多种构造方法，编译器会根据参数数量、位置和类型自动决定调用哪一个

           方法重载（类似CPP的函数重载）
         */

    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person : name = " + name;
    }

    @Override
    public boolean equals(Object o) {
        // 当且仅当o为Person类型
        if (o instanceof Person) {
            Person p = (Person) o;
            /*
                Person p = (Person) o;这行代码的作用是将Object类型的o（它实际上应该是一个Person对象，但编译器在此时并不知道）强制转换为Person类型，
                以便能够访问其name字段进行比较。这是一种类型安全的操作，因为你已经通过instanceof检查确保了o确实是一个Person实例。
             */
            // 并且name字段相同，返回true
            return this.name.equals(p.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    public String getName () {
        return this.name;  //  this变量始终指向当前实例,局部变量和字段重名，局部变量优先级高，需要使用this
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {  //  isBlank()判断是否为空和空格，isEmpty()只判空
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name;
    }

    public void setName(String name1, String name2) { // setName方法重载
        this.name = name1 + " " + name2;
    }
    public int getAge() {
//        this.age = 2024 - this.birth + 1;
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value (0 ~ 100)");
        }
        this.age = age;
    }

    public void run() {
        System.out.println("Person.run");
    }

//    public int getBirth() {
//        return this.birth;
//    }
//
//    public void setBirth(int birth) {
//        if (birth < 0 || birth > 2024) {
//            throw new IllegalArgumentException("invalid birth (0 ~ 2024)");
//        }
//        this.birth = birth;
//    }
}

