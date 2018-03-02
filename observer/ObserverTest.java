package by.kolbun.jobs.patterns.observer;

import by.kolbun.jobs.patterns.observer.meta.MyObjectWithState;

public class ObserverTest {
    public static void exec() {
        System.out.println("\t new object message of logger should be invoked here");
        MyObjectWithState obj = new MyObjectWithState();

        System.out.println();

        //логгер подключается к объекту(добавляется в список подписчиков) в конструкторе, доступен сразу.
        OutputListener out = new OutputListener();
        //добавляем листенер вывода
        obj.subscribe(out);

        System.out.println("\t 2 listeners, modify:");
        obj.setState(5);
        obj.unsubscribe(out);
        System.out.println("\t outputListener was removed, 1 listener, modify:");
        obj.setState(-10);

        System.out.println("\t Create new object");
        MyObjectWithState obj2 = new MyObjectWithState();
        System.out.println("\t clear all listeners");
        obj2.clearListeners();
        System.out.println("\t add outputListener");
        obj2.subscribe(new OutputListener());
        System.out.println("\t modify state");
        obj2.setState(100);

    }
}
