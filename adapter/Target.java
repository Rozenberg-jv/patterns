package by.kolbun.jobs.patterns.adapter;

public class Target implements TargetInterface {
    @Override
    public void drawLine() {
        System.out.println("drawLine Origin");
    }

    @Override
    public void drawCircle() {
        System.out.println("drawCircle Origin");
    }
}
