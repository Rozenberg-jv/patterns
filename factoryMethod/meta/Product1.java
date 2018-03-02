package by.kolbun.jobs.patterns.factoryMethod.meta;

public class Product1 extends Product {

    public Product1(String name, int amount) {
        super(name, amount);
    }

    @Override
    public void printInformation() {
        System.out.println(getName() + " : " + getAmount() + " < Product1");
    }

    @Override
    public void useProduct() {
        System.out.println("use Product1");
    }
}
