package com.siyuan.project2;

/**
 * @author Siyuan
 * @Date 2024/10/18 14:24
 */
public class Customer {
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;


    public Customer(String name, char gender, int age) {
        this(name, age, gender, "", ""); // 注意上面声明的顺序
    }

    public Customer(String name, int age, char gender, String phone, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDetails() {
        return name + "\t" + gender + "\t\t" + age + "\t\t" + phone + "\t" + email;
    }
}
