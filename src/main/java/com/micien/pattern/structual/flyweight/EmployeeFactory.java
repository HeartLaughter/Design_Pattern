package com.micien.pattern.structual.flyweight;

import java.util.HashMap;
import java.util.Map;

public  class EmployeeFactory {
    //为什么要创建容器map map?
    private static final Map<String, Employee> employees = new HashMap<>();
    public static Employee getManager(String department) {
        Manager manager = (Manager) employees.get(department);
        if (manager == null) {
            manager = new Manager(department);
            //只是为了做测试，让你知道不会重复创建多个对象，这个创建一次，并且保存起来就好。
            System.out.println("创建了部门经理:"+ " " + department);
            //别忘记放到hashmap对象池里
            employees.put(department, manager);
        }
        return manager;
    }

}
