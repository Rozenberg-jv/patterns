package by.kolbun.jobs.patterns.delegate;

public class ReportPrinter implements IPrinter {
    @Override
    public String print() {
        return "Report";
    }
}
