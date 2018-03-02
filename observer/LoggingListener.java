package by.kolbun.jobs.patterns.observer;

import by.kolbun.jobs.patterns.observer.meta.SomeListenersInterface;

public class LoggingListener implements SomeListenersInterface {
    @Override
    public void update(int state) {
        System.out.println("Logging: write new state to log: " + state);
    }

    @Override
    public void onCreate(Object newO) {
        System.out.println("Logging: logging creation of new object: " + Integer.toHexString(newO.hashCode()));
    }
}
