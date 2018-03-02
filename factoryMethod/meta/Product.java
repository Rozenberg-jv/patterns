package by.kolbun.jobs.patterns.factoryMethod.meta;

import by.kolbun.jobs.patterns.factoryMethod.IProduct;

public abstract class Product implements IProduct {
    private String name;
    private int amount;

    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAmount() {
        return amount;
    }
}
