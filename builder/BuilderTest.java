package by.kolbun.jobs.patterns.builder;

import by.kolbun.jobs.patterns.builder.meta.Building;

public class BuilderTest {
    public static void exec() {
        // прямой способ
        System.out.println("\t* Первый способ - руками");
        ABuilder builder = new OfficeBuilder();
        builder.startNew();
        builder.buildMaterial();
        builder.buildWindowsNumber();
        builder.buildFloorsNumber();
        builder.buildPurpose();
        builder.buildDimensions();
        Building office = builder.getBuilding();
        System.out.println(office);

        // используя Director
        System.out.println("\t* Второй способ - используя Директор, с тем же билдером");
        Director director = new Director(builder);
        Building buildingD = director.makeBuilding();
        System.out.println(buildingD);
        System.out.println("\t* Третий способ - используя Директор, с новым билдером");
        director.setBuilder(new TownhouseBuilder());
        System.out.println(director.makeBuilding());

        // красивый способ
        System.out.println("\t* Четвертый способ - используя Директор и цепочку вызовов");
        System.out.println(director.makeWithChain());
    }
}
