package main.java;

public class BubbleSort {
    public static int[] bubbleSort(int[] Integer) {
        int temp;
        for (int i = 0; i < Integer.length - 1; i++) {
            for (int j = 0; j < Integer.length - 1 - i; j++) {
                if (Integer[j] > Integer[j + 1]) {
                    temp = Integer[j];
                    Integer[j] = Integer[j + 1];
                    Integer[j + 1] = temp;
                }
            }
        }
        return Integer;
    }
}
