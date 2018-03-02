package by.kolbun.jobs.patterns.facade;

public class Wheels {
    private boolean rotate = false;

    public void rotate(boolean r) {
        rotate = r;
        System.out.println("Wheels rotate: " + rotate);
    }

}
