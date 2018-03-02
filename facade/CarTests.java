package by.kolbun.jobs.patterns.facade;

public class CarTests implements ICar {
    private Engine engine = new Engine();
    private Breaks breaks = new Breaks();
    private Wheels wheels = new Wheels();

    @Override
    public void testEngine() {
        System.out.println(" > test engine");
        engine.startEngine();
        engine.stopEngine();
    }

    @Override
    public void move5Meters() {
        System.out.println(" > move 5 meters");
        engine.startEngine();
        breaks.turnOff();
        engine.accelerate();
        wheels.rotate(true);
        doNormalStop();
    }

    @Override
    public void breaksTest() {
        System.out.println(" > breaks test");
        engine.startEngine();
        breaks.turnOff();
        engine.accelerate();
        engine.accelerate();
        emergencyStop();
    }

    private void doNormalStop() {
        engine.stopAccelerate();
        breaks.turnOn();
        wheels.rotate(false);
        engine.stopEngine();
    }

    private void emergencyStop() {
        engine.stopAccelerate();
        breaks.turnOn();
        wheels.rotate(false);
    }

}
