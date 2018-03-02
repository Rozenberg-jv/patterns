package by.kolbun.jobs.patterns.singleton;

public final class Singleton1 {
    private static Singleton1 INSTANCE = null;

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (INSTANCE == null) INSTANCE = new Singleton1();
        return INSTANCE;
    }
}
