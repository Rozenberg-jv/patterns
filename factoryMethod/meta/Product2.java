package by.kolbun.jobs.patterns.factoryMethod.meta;

public class Product2 extends Product {

    public Product2(String name, int amount) {
        super(name, amount);
    }

    @Override
    public void printInformation() {
        System.out.println(getName() + " : " + getAmount() + " < Product2");
    }

    @Override
    public void useProduct() {
        System.out.println("use Product2");
    }
}
