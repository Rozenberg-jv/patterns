package by.kolbun.jobs.patterns.factoryMethod.factory;

import by.kolbun.jobs.patterns.factoryMethod.IProduct;
import by.kolbun.jobs.patterns.factoryMethod.meta.Product1;

public class Product_1_Factory implements IProductFactory{
    @Override
    public IProduct getNewProduct(String name, int amount) {
        return new Product1(name, amount);
    }
}
