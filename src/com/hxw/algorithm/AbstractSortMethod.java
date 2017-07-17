package com.hxw.algorithm;

/**
 * Created by everhad on 2017/7/17.
 */
public abstract class AbstractSortMethod implements SortMethod {

    public void swap(int[] numbers, int a, int b) {
        if (numbers == null || numbers.length < 2) return;
        if (a < 0 || a >= numbers.length) return;
        if (b < 0 || b >= numbers.length) return;

        int tmp_a = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = tmp_a;
    }
}
