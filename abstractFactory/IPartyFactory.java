package by.kolbun.jobs.patterns.abstractFactory;

import by.kolbun.jobs.patterns.abstractFactory.meta.Archer;
import by.kolbun.jobs.patterns.abstractFactory.meta.Mage;
import by.kolbun.jobs.patterns.abstractFactory.meta.Warrior;

public interface IPartyFactory {
    Mage getMage();

    Archer getArcher();

    Warrior getWarrior();
}
