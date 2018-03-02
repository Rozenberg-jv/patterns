package by.kolbun.jobs.patterns.factoryMethod.factory;

import by.kolbun.jobs.patterns.factoryMethod.IProduct;

public interface IProductFactory {
    IProduct getNewProduct(String name, int amount);
}
