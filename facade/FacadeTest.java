package by.kolbun.jobs.patterns.facade;

public class FacadeTest {
    public static void exec() {
        ICar tests = new CarTests();

        tests.testEngine();
        tests.move5Meters();
        tests.breaksTest();
    }
}
