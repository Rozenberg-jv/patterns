package by.kolbun.jobs.patterns.abstractFactory;

import by.kolbun.jobs.patterns.abstractFactory.meta.Archer;
import by.kolbun.jobs.patterns.abstractFactory.meta.Mage;
import by.kolbun.jobs.patterns.abstractFactory.meta.Warrior;
import by.kolbun.jobs.patterns.abstractFactory.meta.human.HumanArcher;
import by.kolbun.jobs.patterns.abstractFactory.meta.human.HumanMage;
import by.kolbun.jobs.patterns.abstractFactory.meta.human.HumanWarrior;

public class HumanFactory implements IPartyFactory {
    @Override
    public Mage getMage() {
        return new HumanMage();
    }

    @Override
    public Archer getArcher() {
        return new HumanArcher();
    }

    @Override
    public Warrior getWarrior() {
        return new HumanWarrior();
    }
}
