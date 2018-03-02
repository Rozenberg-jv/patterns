package by.kolbun.jobs.patterns.abstractFactory;

import by.kolbun.jobs.patterns.abstractFactory.meta.Archer;
import by.kolbun.jobs.patterns.abstractFactory.meta.Mage;
import by.kolbun.jobs.patterns.abstractFactory.meta.Warrior;
import by.kolbun.jobs.patterns.abstractFactory.meta.orc.OrcArcher;
import by.kolbun.jobs.patterns.abstractFactory.meta.orc.OrcMage;
import by.kolbun.jobs.patterns.abstractFactory.meta.orc.OrcWarrior;

public class OrcFactory implements IPartyFactory {
    @Override
    public Mage getMage() {
        return new OrcMage();
    }

    @Override
    public Archer getArcher() {
        return new OrcArcher();
    }

    @Override
    public Warrior getWarrior() {
        return new OrcWarrior();
    }
}
