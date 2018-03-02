package by.kolbun.jobs.patterns.builder;


import by.kolbun.jobs.patterns.builder.meta.Material;

public class OfficeBuilder extends ABuilder {

    @Override
    void buildMaterial() {
        building.setMaterial(Material.CONCRETE);
    }

    @Override
    void buildWindowsNumber() {
        building.setWindows(240);
    }

    @Override
    void buildFloorsNumber() {
        building.setFloors(30);
    }

    @Override
    void buildPurpose() {
        building.setPurpose("Generally for offices, 1st floor for shops, no living rooms");
    }

    @Override
    void buildDimensions() {
        building.setLen(30);
        building.setWid(15);
    }
}
