package org.towfeeq.DesignPatterns.BehaviouralPatterns.TemplateMethodPattern.Solution;

// Implementing concrete subclass
class ExcelReportParser extends ReportParser {
    @Override
    protected void fetchData() {
        System.out.println("Fetching data for Excel report...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing data for Excel report...");
    }

    @Override
    protected void generateReportContent() {
        System.out.println("Generating Excel report content...");
    }
}
