package by.kolbun.jobs.patterns.decorator2.fillings;

import by.kolbun.jobs.patterns.decorator2.IBurgerFormer;

public class VegetablesFilling extends Filling {
    public VegetablesFilling(IBurgerFormer filling) {
        super(filling, 0.12, "Vegetables");
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
