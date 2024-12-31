package org.towfeeq.DesignPatterns.BehaviouralPatterns.TemplateMethodPattern.Problem;

/*
Problem:
Consider a scenario where you want to create different types of reports (e.g., PDF and Excel).
The steps to generate a report are mostly the same:
    Open the report.
    Fetch data.
    Process data.
    Generate the report.
    Close the report.

The steps like "fetching data" and "processing data" may vary based on the report type.

Without the Template Method Pattern, you might duplicate the structure for each report type,
leading to code duplication and inconsistency.

# any changes to common logic would require changes in every parser, violating
  the DRY(dont repeat yourself) principle
# code duplication is another issue in below code
*/

// PDF Report generation
class PDFReportParser {
    public void parse() {
        open();
        fetch();
        process();

        generate();
        close();
    }

    public void open(){
        System.out.println("Opening report...");
    }
    public void fetch(){
        System.out.println("Fetching data for PDF report...");
    }
    public void process(){
        System.out.println("Processing data for PDF report...");
    }
    public void generate(){
        System.out.println("Generating PDF report...");
    }
    public void close(){
        System.out.println("Closing report...");
    }
}

// Excel Report generation
class ExcelReportParser {
    public void parse() {
        open();
        fetch();
        process();
        generate();
        close();
    }

    public void open(){
        System.out.println("Opening report...");
    }
    public void fetch(){
        System.out.println("Fetching data for Excel report...");
    }
    public void process(){
        System.out.println("Processing data for Excel report...");
    }
    public void generate(){
        System.out.println("Generating Excel report...");
    }
    public void close(){
        System.out.println("Closing report...");
    }
}

public class WithoutTemplateMethodPattern {
    public static void main(String[] args) {
        PDFReportParser pdfReportParser = new PDFReportParser();
        ExcelReportParser excelReportParser = new ExcelReportParser();
        pdfReportParser.parse();
        excelReportParser.parse();
    }
}
