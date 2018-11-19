package inclassSortinginAsc;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] a = { 2,8,9,3,4,3,2,6,6,2,4,9,8 };
        System.out.println(Arrays.toString(sortArray(a)));
    }
	
	public static int[] sortArray(int[] nonSortedArray) {
        int[] sortedArray = new int[nonSortedArray.length];
        int temp;
        for (int j = 0; j < nonSortedArray.length - 1; j++) {
        for (int i = 0; i < nonSortedArray.length - 1; i++) {
            if (nonSortedArray[i] > nonSortedArray[i + 1]) {
                temp = nonSortedArray[i];
                nonSortedArray[i] = nonSortedArray[i + 1];
                nonSortedArray[i + 1] = temp;
                sortedArray = nonSortedArray;
            }
        }
        }
        return sortedArray;
    }
}
