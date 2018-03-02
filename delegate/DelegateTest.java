package by.kolbun.jobs.patterns.delegate;

public class DelegateTest {
    public static void exec() {
        Printer printer = new Printer(new OrderPrinter());
        printer.print();

        printer.setPrinter(new ReportPrinter());
        printer.print();

        printer.setPrinter(new LetterPrinter());
        printer.print();
    }
}
