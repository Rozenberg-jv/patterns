package by.kolbun.jobs.patterns.strategy;

import java.util.Arrays;

public class BubbleSortingStrategy implements SortingStrategy {

    @Override
    public void sort(int[] arr) {
        int tmp;

        System.out.println("Сортировка пузырьком");
        System.out.println("до:\t\t" + Arrays.toString(arr));
        for (int barier = arr.length - 1; barier >= 0; barier--) {
            for (int i = 0; i < barier; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }

}
