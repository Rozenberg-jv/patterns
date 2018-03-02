package by.kolbun.jobs.patterns.abstractFactory.meta.human;

import by.kolbun.jobs.patterns.abstractFactory.meta.Archer;

public class HumanArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("human shoot");
    }

    @Override
    public void doSmthing() {
        shoot();
    }
}
