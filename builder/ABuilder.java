package by.kolbun.jobs.patterns.builder;

import by.kolbun.jobs.patterns.builder.meta.Building;

public abstract class ABuilder {

    Building building;

    void startNew() {
        building = new Building();
    }

    abstract void buildMaterial();

    abstract void buildWindowsNumber();

    abstract void buildFloorsNumber();

    abstract void buildPurpose();

    abstract void buildDimensions();

    Building getBuilding() {
        return building;
    }
}
