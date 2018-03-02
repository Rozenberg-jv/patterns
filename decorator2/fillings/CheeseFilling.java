package by.kolbun.jobs.patterns.decorator2.fillings;

import by.kolbun.jobs.patterns.decorator2.IBurgerFormer;

public class CheeseFilling extends Filling {
    public CheeseFilling(IBurgerFormer filling) {
        super(filling, 0.25, "Cheese");
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
