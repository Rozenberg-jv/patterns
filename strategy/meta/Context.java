package by.kolbun.jobs.patterns.strategy.meta;

import by.kolbun.jobs.patterns.strategy.SortingStrategy;

public class Context {
    SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void permormStrategy(int[] arr) {
        if (strategy != null)
            strategy.sort(arr);
        else System.out.println("Strategy is not set");
    }
}
