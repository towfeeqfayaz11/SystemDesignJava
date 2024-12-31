package org.towfeeq.DesignPatterns.BehaviouralPatterns.TemplateMethodPattern.Solution;

// Implementing concrete subclass
class PDFReportParser extends ReportParser {
    @Override
    protected void fetchData() {
        System.out.println("Fetching data for PDF report...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing data for PDF report...");
    }

    @Override
    protected void generateReportContent() {
        System.out.println("Generating PDF report content...");
    }

    @Override
    protected boolean isEncryptionRequired() {
        return true;
    }
}