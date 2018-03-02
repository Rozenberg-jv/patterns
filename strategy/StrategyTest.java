package by.kolbun.jobs.patterns.strategy;

import by.kolbun.jobs.patterns.strategy.meta.Context;

import java.util.Arrays;

public class StrategyTest {
    public static void exec() {
        Context con = new Context();
        long time;

        int[] arr1 = {1, 5, 2, -10, 15, 11, -10, -12, 0, 2, 5, 5};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);

        time = System.nanoTime();
        con.setStrategy(new BubbleSortingStrategy());
        con.permormStrategy(arr1);
        System.out.println("\t Time:" + (System.nanoTime() - time)/1000);

        time = System.nanoTime();
        con.setStrategy(new InsertSortingStrategy());
        con.permormStrategy(arr2);
        System.out.println("\t Time:" + (System.nanoTime() - time)/1000);

        time = System.nanoTime();
        con.setStrategy(new SelectionSortingStrategy());
        con.permormStrategy(arr3);
        System.out.println("\t Time:" + (System.nanoTime() - time)/1000);

    }
}
