package by.kolbun.jobs.patterns.decorator2;

public class BurgerFormer implements IBurgerFormer {

    private double cost;
    private final String name = "Bread";

    public BurgerFormer(double cost) {
        this.cost = cost;
    }

    @Override
    public StringBuilder orderPrint() {
        return new StringBuilder().append("*").append(this.name).append(".....").append(cost).append("\n\r");
    }

    @Override
    public double countCost() {
        return cost;
    }
}
