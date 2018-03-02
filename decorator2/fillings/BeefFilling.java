package by.kolbun.jobs.patterns.decorator2.fillings;

import by.kolbun.jobs.patterns.decorator2.IBurgerFormer;

public class BeefFilling extends Filling {
    public BeefFilling(IBurgerFormer filling) {
        super(filling, 1.68, "Beef");
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
