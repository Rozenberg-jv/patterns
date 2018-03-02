package by.kolbun.jobs.patterns.decorator2.fillings;

import by.kolbun.jobs.patterns.decorator2.IBurgerFormer;

public abstract class Filling implements IBurgerFormer {

    private IBurgerFormer filling;
    private double cost;
    private final String name;

    public Filling(IBurgerFormer filling, double cost, String name) {
        this.filling = filling;
        this.cost = cost;
        this.name = name;
    }

    @Override
    public double countCost() {
        return cost + filling.countCost();
    }

    @Override
    public StringBuilder orderPrint() {
        return filling.orderPrint().append("*").append(this.name).append(".....").append(cost).append("\n\r");
    }
}
