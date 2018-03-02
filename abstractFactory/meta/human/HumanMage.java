package by.kolbun.jobs.patterns.abstractFactory.meta.human;

import by.kolbun.jobs.patterns.abstractFactory.meta.Mage;

public class HumanMage implements Mage {
    @Override
    public void cast() {
        System.out.println("human cast");
    }

    @Override
    public void doSmthing() {
        cast();
    }
}
