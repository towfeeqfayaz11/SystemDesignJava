package org.towfeeq.DesignPatterns.BehaviouralPatterns.TemplateMethodPattern.Solution;

// Client Code
public class WithTemplateMethodPattern {
    public static void main(String[] args) {
        System.out.println("Generating PDF Report:");
        ReportParser pdfReport = new PDFReportParser();
        pdfReport.parse();
        System.out.println("\nGenerating Excel Report:");
        ReportParser excelReport = new ExcelReportParser();
        excelReport.parse();
    }
}

/*
Key Takeaways
    - Algorithm Workflow: Template Method enforces a workflow structure.
    - Flexibility: Subclasses customize behavior without altering the structure.
    - Hook Methods: Allow optional steps, adding more flexibility.
    - Use Cases: Commonly used in frameworks (e.g., Swing, Spring) and workflows (e.g., ETL processes, game development).
*/