package by.kolbun.jobs.patterns.abstractFactory.meta.orc;

import by.kolbun.jobs.patterns.abstractFactory.meta.Warrior;

public class OrcWarrior implements Warrior {
    @Override
    public void hit() {
        System.out.println("orc hit");
    }

    @Override
    public void doSmthing() {
        hit();
    }
}
