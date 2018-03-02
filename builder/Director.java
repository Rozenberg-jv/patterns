package by.kolbun.jobs.patterns.builder;

import by.kolbun.jobs.patterns.builder.meta.Building;
import by.kolbun.jobs.patterns.builder.meta.Material;

public class Director {
    ABuilder builder;

    public Director(ABuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(ABuilder builder) {
        this.builder = builder;
    }

    public Building makeBuilding() {
        builder.startNew();
        builder.buildMaterial();
        builder.buildWindowsNumber();
        builder.buildFloorsNumber();
        builder.buildPurpose();
        builder.buildDimensions();
        return builder.getBuilding();
    }

    public Building makeWithChain() {
        return new BBuilder().buildMaterial(Material.METAL)
                .buildWindows(0)
                .buildLen(5)
                .buildPurpose("garage")
                .getBuilding();
    }

}
