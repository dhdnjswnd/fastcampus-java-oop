package org.fastcampus;

import org.fastcampus.logic.BubbleSort;
import org.fastcampus.logic.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();
        System.out.println("{result} " + sort.sort(Arrays.asList(args)));
    }
}