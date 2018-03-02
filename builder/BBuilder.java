package by.kolbun.jobs.patterns.builder;

import by.kolbun.jobs.patterns.builder.meta.Building;
import by.kolbun.jobs.patterns.builder.meta.Material;

public class BBuilder {
    // еще одня реализация, красиво
    // с default значениями
    // и поддержкой однострочного вызова

    private Material m = Material.WOOD;
    private int wN = 2;
    private int fN = 1;
    private String p = "undefined";
    private int len = 3;
    private int wid = 3;

    BBuilder buildMaterial(Material m) {
        this.m = m;
        return this;
    }

    BBuilder buildWindows(int n) {
        this.wN = n;
        return this;
    }

    BBuilder buildFloors(int n) {
        this.fN = n;
        return this;
    }

    BBuilder buildPurpose(String s) {
        this.p = s;
        return this;
    }

    BBuilder buildLen(int n) {
        this.len = n;
        return this;
    }

    BBuilder buildWid(int n) {
        this.wid = n;
        return this;
    }

    Building getBuilding() {
        Building b = new Building();
        b.setMaterial(m);
        b.setWindows(wN);
        b.setFloors(fN);
        b.setPurpose(p);
        b.setLen(len);
        b.setWid(wid);
        return b;
    }


}
