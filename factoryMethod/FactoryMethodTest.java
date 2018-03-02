package by.kolbun.jobs.patterns.factoryMethod;

import by.kolbun.jobs.patterns.factoryMethod.factory.IProductFactory;
import by.kolbun.jobs.patterns.factoryMethod.factory.Product_1_Factory;
import by.kolbun.jobs.patterns.factoryMethod.factory.Product_2_Factory;

public class FactoryMethodTest {
    public static void exec() {
        IProductFactory prod1Fact = new Product_1_Factory();
        IProductFactory prod2Fact = new Product_2_Factory();

        IProduct prod1 = prod1Fact.getNewProduct("Product1 name", 5);
        IProduct prod2 = prod2Fact.getNewProduct("Product2 name", 10);

        prod1.useProduct();
        prod1.printInformation();

        prod2.useProduct();
        prod2.printInformation();

        System.out.println();

        IProductFactory factory = getFactoryByType("2");
        IProduct newProd = factory.getNewProduct("productName", 100);
        newProd.printInformation();
        newProd.useProduct();

    }

    private static IProductFactory getFactoryByType(String type) {
        switch (type) {
            case "1":
                return new Product_1_Factory();
            case "2":
                return new Product_2_Factory();
            default:
                return null;
        }
    }


}
