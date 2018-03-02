package by.kolbun.jobs.patterns.singleton;

public class SingletonTest {
    public static void exec() {
        System.out.println("\n   > Singleton1 objects. Lazy initialization");
        Singleton1 r1 = Singleton1.getInstance();
        Singleton1 r2 = Singleton1.getInstance();
        Singleton1 r3 = Singleton1.getInstance();
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("\n   > Singleton2 objects. Static object initialization");
        Singleton2 t1 = Singleton2.getInstance();
        Singleton2 t2 = Singleton2.getInstance();
        Singleton2 t3 = Singleton2.getInstance();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("\n   > Singleton3 objects. Double-checked locking");
        Singleton3 d1 = Singleton3.getInstance();
        Singleton3 d2 = Singleton3.getInstance();
        Singleton3 d3 = Singleton3.getInstance();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println("\n   > Singleton4 objects. Nested class holder");
        Singleton4 i1 = Singleton4.getInstance();
        Singleton4 i2 = Singleton4.getInstance();
        Singleton4 i3 = Singleton4.getInstance();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);


    }
}
