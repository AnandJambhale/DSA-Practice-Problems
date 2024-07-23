package org.problems;

public class Occurrences {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 0, 0, 0, 0, 1, 1, 0,1,1,1};
        int occurrence = 0;
        int anotherValue = 0;
        int firstInteger = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (firstInteger == arr[i]) {
                occurrence++;
            } else {
                anotherValue = arr[i];
                occurrence--;
            }
        }
        int maxOccurred = occurrence > 0 ? firstInteger : anotherValue;
        System.out.println("Maximum occurrences are of " + maxOccurred);
    }
}
