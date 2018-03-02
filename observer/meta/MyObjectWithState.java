package by.kolbun.jobs.patterns.observer.meta;

import by.kolbun.jobs.patterns.observer.LoggingListener;

import java.util.ArrayList;
import java.util.Iterator;

public class MyObjectWithState implements Observable {
    private ArrayList<SomeListenersInterface> subs = new ArrayList<>();

    private int state;

    public MyObjectWithState() {
        this.subscribe(new LoggingListener());
        notifyOnCreate();
    }

    public void subscribe(SomeListenersInterface sub) {
        this.subs.add(sub);
    }

    public SomeListenersInterface unsubscribe(SomeListenersInterface sub) {
        SomeListenersInterface removed;
        for (Iterator<SomeListenersInterface> iter = subs.iterator(); iter.hasNext(); ) {
            removed = iter.next();
            if (removed == sub) {
                iter.remove();
                return removed;
            }
        }
        return null;
    }

    public void notifyStateModified() {
        subs.forEach((subscriber) -> subscriber.update(state));
    }

    public void notifyOnCreate() {
        subs.forEach((subscriber) -> subscriber.onCreate(this));
    }

    public void setState(int i) {
        state = i;
        notifyStateModified();
    }

    public void clearListeners() {
        subs.clear();
    }
}
