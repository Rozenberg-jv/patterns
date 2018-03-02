package by.kolbun.jobs.patterns.facade;

public class Engine {

    public void startEngine() {
        System.out.println("Engine: start");
    }

    public void stopAccelerate() {
        System.out.println("Engine: decrease speed");
    }

    public void accelerate() {
        System.out.println("Engine: move 5 meters");
    }

    public void stopEngine() {
        System.out.println("Engine: stop");
    }

}
