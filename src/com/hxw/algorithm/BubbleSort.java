package com.hxw.algorithm;

/**
 * 假设是N个数字，要完成升序排列，每次从第一个元素开始，依次将（剩余序列）最大数字放置到第N、N-1、N-2...位置处。
 * Created by everhad on 2017/7/17.
 */
public class BubbleSort extends AbstractSortMethod {

    @Override
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    swap(numbers, j, j - 1);
                }
            }
        }
    }

    public static void bubbleSort(int[] numbers) {
        int swap;
        for (int end = numbers.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = swap;
                }
            }
        }
    }
}
