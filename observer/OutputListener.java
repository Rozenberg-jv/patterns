package by.kolbun.jobs.patterns.observer;

import by.kolbun.jobs.patterns.observer.meta.SomeListenersInterface;

public class OutputListener implements SomeListenersInterface {
    @Override
    public void update(int state) {
        System.out.println("Output message: state was modified to " + state);
    }

    @Override
    public void onCreate(Object newO) {
//        System.out.println("Output message: new object was created: " + Integer.toHexString(newO.hashCode()));
        //метод ничего не делает, так как этот листнер недоступен на этапе создания объекта, мы подключаем его позже
    }
}
