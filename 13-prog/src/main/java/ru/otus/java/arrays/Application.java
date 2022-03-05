package ru.otus.java.arrays;

import ru.otus.java.arrays.util.ArrayUtil;

public class Application {
    public static void main(String[] args) {
        int[] array = ArrayUtil.generateArray(10);

        Arrays task = new Arrays();
        task.reverseArray(array);
        task.average(array);

        String left = "11213";
        String right = "32112";
        Anagram anagram = new Anagram();
        boolean result = anagram.check(left, right);

        System.out.println(result);
    }
}