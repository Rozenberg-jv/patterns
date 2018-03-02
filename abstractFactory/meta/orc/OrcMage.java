package by.kolbun.jobs.patterns.abstractFactory.meta.orc;

import by.kolbun.jobs.patterns.abstractFactory.meta.Mage;

public class OrcMage implements Mage {
    @Override
    public void cast() {
        System.out.println("orc cast");
    }

    @Override
    public void doSmthing() {
        cast();
    }
}
