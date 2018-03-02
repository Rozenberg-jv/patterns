package by.kolbun.jobs.patterns.singleton;

public class Singleton2 {
    private static Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        return INSTANCE;
    }
}
