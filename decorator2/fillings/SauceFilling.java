package by.kolbun.jobs.patterns.decorator2.fillings;

import by.kolbun.jobs.patterns.decorator2.IBurgerFormer;

public class SauceFilling extends Filling {
    public SauceFilling(IBurgerFormer filling) {
        super(filling, 0.05, "Sauce");
    }

    @Override
    public double countCost() {
        return super.countCost();
    }

    @Override
    public StringBuilder orderPrint() {
        return super.orderPrint();
    }
}
