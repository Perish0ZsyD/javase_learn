package com.siyuan.project3.junit;

import com.siyuan.project3.domain.Employee;
import com.siyuan.project3.service.NameListService;

/**
 * @author Siyuan
 * @Date 2024/10/18 16:31
 */
public class NameListServiceTest {
    public static void main(String[] args) {
        NameListServiceTest test = new NameListServiceTest();
        test.getAllEmployees();
    }

    public void getAllEmployees() {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
