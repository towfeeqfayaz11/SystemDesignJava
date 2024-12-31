package org.towfeeq.DesignPatterns.BehaviouralPatterns.TemplateMethodPattern.Solution;

/*
Explanation for the ReportParser class
public final void parse():
    - Purpose: This is the template method.
    - public: It needs to be accessible by any client code that uses the Report class.
    - final: Prevents subclasses from overriding this method, ensuring that the sequence
      of steps defined in the template method remains consistent.

private void openReport() and private void closeReport():

    - Purpose: These methods implement common behavior that is not intended to be modified or
      accessed by subclasses.
    - private: Restricts access to the ReportParser class itself, as these are internal details
      that should not be visible or overridable by subclasses.

protected abstract void fetchData(), protected abstract void processData(), protected abstract void generateReportContent():
    - Purpose: These are abstract methods that represent steps which must be implemented by subclasses,
      allowing flexibility in the specific details of each step.
    - protected: Allows subclasses to override these methods while preventing access from unrelated
      external classes.

protected boolean isEncryptionRequired():
    - Purpose: This is a hook method that provides optional behavior. Subclasses can override
      it to modify behavior (e.g., enable encryption).
    - protected: Ensures that only subclasses can change the default behavior.

private void encryptDocument():
    - Purpose: Implements the fixed behavior for encryption when required. It is called conditionally
      based on the hook method.
    - private: Keeps this behavior encapsulated to ensure it is not directly overridden or accessed
      by subclasses.
*/

// Define the Abstract Class (base class)
abstract class ReportParser {
    // Template method
    public final void parse() {
        openReport();
        fetchData();
        processData();
        if (isEncryptionRequired()) {
            encryptDocument();
        }
        generateReportContent();
        closeReport();
    }

    // Common steps (concrete methods)
    private void openReport() {
        System.out.println("Opening report...");
    }

    private void closeReport() {
        System.out.println("Closing report...");
    }

    // Hook method with a default implementation
    protected boolean isEncryptionRequired() {
        return false;
    }

    private void encryptDocument() {
        System.out.println("Encrypting document...");
    }

    // Steps to be implemented by subclasses
    protected abstract void fetchData();
    protected abstract void processData();
    protected abstract void generateReportContent();

}
