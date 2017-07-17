package com.hxw.algorithm.util;


import com.hxw.algorithm.SortMethod;

import java.util.Random;

/**
 * Created by everhad on 2017/7/17.
 */
public final class SortingTools {
    private static Random random = new Random();

    public static void testSort(SortMethod method, int numberSize) {
        int[] numbers = new int[numberSize];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        SortingTools.printNumbers(numbers);
        Log.println("before sort. isAscending = " + SortingTools.isAscending(numbers));

        method.sort(numbers);

        SortingTools.printNumbers(numbers);
        Log.println("after sort. isAscending = " + SortingTools.isAscending(numbers));
    }

    public static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            Log.print(numbers[i] + ", ");
        }

        Log.print("\n");
    }

    public static boolean isAscending(int[] numbers) {
        int prev = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < prev) {
                return false;
            }

            prev = numbers[i];
        }

        return true;
    }
}
