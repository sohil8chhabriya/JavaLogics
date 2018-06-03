package com.sorting;

public class SortUtilities {
    /**
     * Function swaps 2 element of the list
     * 
     * @param a first swapping element
     * @param b second swapping element
     * @param list list in which swap happens
     */
    public static void swap(int a, int b, int[] list) {
       int temp = list[a];
       list[a] = list[b];
       list[b] = temp;
    }

    /**
     * Print the given list
     * @param list is list to print
     */
    public static void printList(int[] list) {
       for (int i=0; i<list.length; i++)
           System.out.print(list[i] +  " ");
       System.out.print(" \n");
    }
}

