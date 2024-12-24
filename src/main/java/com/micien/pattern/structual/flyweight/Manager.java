package com.micien.pattern.structual.flyweight;

public class Manager extends Employee {

    public Manager(String reportContent) {
        this.reportContent = reportContent;
    }

    private String reportContent;

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    void report() {
        System.out.println("Manager report" + reportContent);
    }
}
