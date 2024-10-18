package com.siyuan.project2;

/**
 * @author Siyuan
 * @Date 2024/10/18 14:24
 */
public class CustomerList {
    private final Customer[] customers; // 初始化之后，customers指向不能改变
    private int total = 0;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer newCustomer) {
        if (total >= customers.length) {return false;} // 超过数组初始化最大值
        customers[total++] = newCustomer;
        return true;
    }

    public boolean replaceCustomer(int index, Customer newCustomer) {
        if (index < 0 || index >= total) {return false;} // 判断数组是否越界
        customers[index] = newCustomer;
        return true;
    }

    public boolean removeCustomer(int index) {
        if (index < 0 || index >= total) {return false;}
//        for (int i = index; i < total - 1; i++) {
//            customers[i] = customers[i+1];
//        }
        System.arraycopy(customers, index + 1, customers, index, total - 1 - index); // total - 1 - (index + 1) + 1;index访问0 ~ total - 1
        customers[--total] = null;

        return true;
    }

    public Customer[] getAllCustomer() {
        Customer[] custs = new Customer[total];
        System.arraycopy(customers, 0, custs, 0, total); // 复制数组 优化使用arraycopy
        return custs;
    }

    public int getTotal() {
        return total;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {return null;}

        return customers[index];
    }
}
