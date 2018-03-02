package by.kolbun.jobs.patterns.decorator2;

import by.kolbun.jobs.patterns.decorator2.fillings.BeefFilling;
import by.kolbun.jobs.patterns.decorator2.fillings.CheeseFilling;
import by.kolbun.jobs.patterns.decorator2.fillings.SauceFilling;
import by.kolbun.jobs.patterns.decorator2.fillings.VegetablesFilling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorTest {
    private static String input = "";

    public static void exec() {
        IBurgerFormer burger = new BurgerFormer(0.99);
        IBurgerFormer lastFilling = burger;

        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
            printmenu();
            input = r.readLine();
            while (!"".equals(input)) {
                int inpInt = Integer.parseInt(input);
                switch (inpInt) {
                    case 1:
                        lastFilling = new VegetablesFilling(lastFilling);
                        break;
                    case 2:
                        lastFilling = new BeefFilling(lastFilling);
                        break;
                    case 3:
                        lastFilling = new CheeseFilling(lastFilling);
                        break;
                    case 4:
                        lastFilling = new SauceFilling(lastFilling);
                        break;
                }
                input = r.readLine();
            }
            System.out.println("Your order:");
            System.out.println(lastFilling.orderPrint());
            System.out.printf("Total cost: %.2f", lastFilling.countCost());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static void printmenu() {
        System.out.println("  Choose fillings you want:");
        System.out.println("1. Vegetables");
        System.out.println("2. Beef");
        System.out.println("3. Cheese");
        System.out.println("4. Sauce");
        System.out.println("  > enter empty string to finish ordering.");
    }
}
