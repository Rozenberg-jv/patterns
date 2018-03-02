package by.kolbun.jobs.patterns.strategy;

import java.util.Arrays;

public class InsertSortingStrategy implements SortingStrategy {

    public void sort(int[] arr) {
        int index;
        int tmp;

        System.out.println("Сортировка вставками");
        System.out.println("до:\t\t" + Arrays.toString(arr));

        for (int barier = 1; barier < arr.length; barier++) {
            index = barier;
            while (index - 1 >= 0 && arr[index] < arr[index - 1]) {
                tmp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = tmp;
                index--;
            }
        }

        System.out.println("после:\t" + Arrays.toString(arr));
    }
}
