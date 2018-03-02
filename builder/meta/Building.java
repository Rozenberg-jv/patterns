package by.kolbun.jobs.patterns.builder.meta;

public class Building {
    private Material material;
    private int windows;
    private int floors;
    private String purpose;
    private int len;
    private int wid;

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    @Override
    public String toString() {
        return "material: " + material + "\n" +
                "windows: " + windows + "\n" +
                "floors: " + floors + "\n" +
                "purpose: " + purpose + "\n" +
                "len*wid: " + len + "x" + wid + "\n";
    }

}
