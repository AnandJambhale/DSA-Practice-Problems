package org.problems;

import java.util.Arrays;
import java.util.logging.Logger;

public class Sorting {
    private static Logger logger = Logger.getLogger(Sorting.class.getName());

    public static void main(String[] args) {
        /*Sorting an array in bubble sort algorithm*/
        System.out.println(Arrays.toString(sortArray(new int[]{64, 34, 25, 12, 22, 11, 90})));
        System.out.println(Arrays.toString(sortArray(new int[]{2, 0, 2, 1, 1, 0})));

        /*Replace array with the multiplication of elements other than the element on that index of an array*/
        System.out.println("Multiplication of elements on other indexes.");
        System.out.println(Arrays.toString(multiplyArray(new int[]{2, 8, 2, 9, 1, 5})));
        System.out.println(Arrays.toString(multiplyArray2(new int[]{2, 8, 2, 9, 1, 5})));
    }

    private static int[] sortArray(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] multiplyArray(int[] arr) {
        int[] multipliedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int multiplication = 1;
            for (int j = i + 1; j < arr.length; j++) {
                multiplication *= arr[j];
            }
            for (int k = 0; k < i; k++) {
                multiplication *= arr[k];
            }
            multipliedArray[i] = multiplication;
        }
        return multipliedArray;
    }

    private static int[] multiplyArray2(int[] arr) {
        int[] arrL = new int[arr.length];
        int[] arrR = new int[arr.length];
        int[] arrAns = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int multiplication = 1;
            for (int j = i + 1; j < arr.length; j++) {
                multiplication *= arr[j];
            }
            arrL[i] = multiplication;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int multiplication = 1;
            for (int j = 0; j < i; j++) {
                multiplication *= arr[j];
            }
            arrR[i] = multiplication;
        }
        for (int i = 0; i < arr.length; i++) {
            arrAns[i] = arrL[i] * arrR[i];
        }
        return arrAns;
    }
}
