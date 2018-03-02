package by.kolbun.jobs.patterns.factoryMethod.factory;

import by.kolbun.jobs.patterns.factoryMethod.IProduct;
import by.kolbun.jobs.patterns.factoryMethod.meta.Product2;

public class Product_2_Factory implements IProductFactory {
    @Override
    public IProduct getNewProduct(String name, int amount) {
        return new Product2(name, amount);
    }
}
