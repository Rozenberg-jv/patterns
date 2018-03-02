package by.kolbun.jobs.patterns.delegate;

public class LetterPrinter implements IPrinter {
    @Override
    public String print() {
        return "Letter";
    }
}
