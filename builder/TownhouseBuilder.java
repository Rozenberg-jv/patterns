package by.kolbun.jobs.patterns.builder;

import by.kolbun.jobs.patterns.builder.meta.Material;

public class TownhouseBuilder extends ABuilder {
    @Override
    void buildMaterial() {
        building.setMaterial(Material.STONE);
    }

    @Override
    void buildWindowsNumber() {
        building.setWindows(5);
    }

    @Override
    void buildFloorsNumber() {
        building.setFloors(2);
    }

    @Override
    void buildPurpose() {
        building.setPurpose("Living townhouse");
    }

    @Override
    void buildDimensions() {
        building.setLen(5);
        building.setWid(4);
    }
}
