package com.yasinderu;

public class HackerRank {
    public int EqualizeArray(int[] arr) {
//        int arr[] = {3, 3, 2, 1, 3};
        int max = 0;
        int c[] = new int[6];
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
            c[arr[i]]++;
//            System.out.println(c[arr[i]]);
        }
//        System.out.println();
        for (int i=0; i<c.length; i++) {
            max = Math.max(max, c[i]);
            System.out.println(c[i]);
        }
        return arr.length - max;
    }
}
