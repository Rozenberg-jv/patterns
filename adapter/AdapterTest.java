package by.kolbun.jobs.patterns.adapter;

public class AdapterTest {
    public static void exec() {
        TargetInterface target = new Target();
        System.out.println("\t* Изначально существующий класс Target имеет функционал drawCircle и drawLine," +
                "объявленный в интерфейсе TargetInterface");
        target.drawCircle();
        target.drawLine();

        System.out.println("\t* Также у нас имеется класс Adaptee, который мы хотели бы использовать для тех же целей");
        System.out.println("\t* Мы создали новый класс Adapter, реализующий интерфейс TargetInterface и" +
                "с помощью делегирования используем функционал класса Adaptee из методов интерфейса TargetInterface");
        System.out.println("\t* Вызываем new Adapter.drawCircle() и т.д.");
        TargetInterface adapter = new Adapter();
        adapter.drawCircle();
        adapter.drawLine();
    }
}
