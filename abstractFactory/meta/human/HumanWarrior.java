package by.kolbun.jobs.patterns.abstractFactory.meta.human;

import by.kolbun.jobs.patterns.abstractFactory.meta.Warrior;

public class HumanWarrior implements Warrior {
    @Override
    public void hit() {
        System.out.println("human hit");
    }

    @Override
    public void doSmthing() {
        hit();
    }
}
