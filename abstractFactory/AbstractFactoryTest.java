package by.kolbun.jobs.patterns.abstractFactory;

import by.kolbun.jobs.patterns.abstractFactory.meta.IClassMarker;

import java.util.ArrayList;
import java.util.List;

public class AbstractFactoryTest {
    public static void exec() {
        IPartyFactory humanFactory = new HumanFactory();
        IPartyFactory orcFactory = new OrcFactory();
        getPartyByRaceFactory(humanFactory).forEach(IClassMarker::doSmthing);
        System.out.println();
        getPartyByRaceFactory(orcFactory).forEach(IClassMarker::doSmthing);
    }

    public static List<IClassMarker> getPartyByRaceFactory(IPartyFactory factory) {
        List<IClassMarker> result = new ArrayList<>();
        result.add(factory.getArcher());
        result.add(factory.getMage());
        result.add(factory.getWarrior());
        return result;
    }
}
