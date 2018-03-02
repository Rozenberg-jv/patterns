package by.kolbun.jobs.patterns.delegate;

public class Printer {
    IPrinter printer;

    public Printer(IPrinter printer) {
        this.printer = printer;
    }

    public void setPrinter(IPrinter printer) {
        this.printer = printer;
    }

    public void print() {
        System.out.println("printed: " + printer.print());
    }
}
