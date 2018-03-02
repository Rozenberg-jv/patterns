package by.kolbun.jobs.patterns.strategy;

import java.util.Arrays;

public class SelectionSortingStrategy implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        int tmp;

        System.out.println("Сортировка выборками");
        System.out.println("до:\t\t" + Arrays.toString(arr));
        for (int barier = 0; barier < arr.length - 1; barier++) {
            for (int i = barier + 1; i < arr.length; i++) {
                if (arr[i] < arr[barier]) {
                    tmp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = tmp;
                }
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}
