package by.kolbun.jobs.patterns.abstractFactory.meta.orc;

import by.kolbun.jobs.patterns.abstractFactory.meta.Archer;

public class OrcArcher implements Archer{
    @Override
    public void shoot() {
        System.out.println("orc shoot");
    }

    @Override
    public void doSmthing() {
        shoot();
    }
}
