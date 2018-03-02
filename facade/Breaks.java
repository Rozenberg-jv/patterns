package by.kolbun.jobs.patterns.facade;

public class Breaks {

    boolean blocked = false;

    public void turnOn() {
        blocked = true;
        System.out.println("Breaks: blocked");
    }

    public void turnOff() {
        blocked = false;
        System.out.println("Breaks: unblocked");
    }

}
