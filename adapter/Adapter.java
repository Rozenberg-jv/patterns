package by.kolbun.jobs.patterns.adapter;

public class Adapter implements TargetInterface {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void drawLine() {
        adaptee.drawLineAnother();
    }

    @Override
    public void drawCircle() {
        adaptee.drawCircleAnother();
    }
}
