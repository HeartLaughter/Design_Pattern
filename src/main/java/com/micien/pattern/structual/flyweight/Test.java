package com.micien.pattern.structual.flyweight;

public class Test {
    public static void main(String[] args) {
        final String[] department = {"QA", "PM", "Admin"};
        for (int i = 0; i < 10; i++) {
            final String departmentName = department[(int)(Math.random()*department.length)];
            EmployeeFactory factory = new EmployeeFactory();
            Manager decided_report_manager = (Manager) factory.getManager(departmentName);
            decided_report_manager.report();
        }
    }

}
