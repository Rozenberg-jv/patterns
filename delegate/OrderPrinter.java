package by.kolbun.jobs.patterns.delegate;

public class OrderPrinter implements IPrinter {
    @Override
    public String print() {
        return "Order";
    }
}
