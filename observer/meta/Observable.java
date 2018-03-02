package by.kolbun.jobs.patterns.observer.meta;

public interface Observable {
    void subscribe(SomeListenersInterface listener);
    SomeListenersInterface unsubscribe(SomeListenersInterface listener);
    void clearListeners();

    void notifyStateModified();
    void notifyOnCreate();

}
