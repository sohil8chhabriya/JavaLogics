package com.app;

/**
*
* @author Sohil Chhabriya
*/

import com.calculation.*;
import com.sorting.*;
public class App {
    public static void main(String []args) {
        int[] list = new int[] {11,2,8,9,6,3,1,5};
        int caseInt = 5;
        switch(args!=null&&args.length>0?Integer.parseInt(args[0]):caseInt) {
            case 1:
                SortLogic selectionSort = new SortLogic();
                selectionSort.setList(list);
                selectionSort.sortListBySelectionSort();
                break;
            case 2:
                SortLogic insertionSort = new SortLogic();
                insertionSort.setList(list);
                insertionSort.sortListByInsertionSort();
                break;
            
            case 3:
                SortLogic bubbleSort = new SortLogic();
                bubbleSort.setList(list);
                bubbleSort.sortListByBubbleSort();
                break;

            case 4:
                SortLogic quickSort = new SortLogic();
                quickSort.setList(list);
                quickSort.sortListByQuickSort(0, list.length-1);
                break;
            case 5:
                System.out.println("Enter value in poly1");
                int[] coefficient = new int[]{2,4,5,6};
                int[] exponent = new int[]{2,4,5,6};
                Polynomial poly1 = new Polynomial().addElementsToPoly(coefficient, exponent);
                Polynomial poly2 = new Polynomial().addElementsToPoly(coefficient, exponent);
                PolyOperations.printPoly(poly1);
                PolyOperations.printPoly(poly2);
                PolyOperations.addPoly(poly1, poly2);
                break;
            case 0:
            default:
                System.out.println("Give Arguments:");
                System.out.println("run mvn with option (java -jar target\\Sorting-1.0-SNAPSHOT.jar)");
                System.out.println("1. Selection Sort");
                System.out.println("2. Insertion Sort");
                System.out.println("3. Bubble Sort");
                System.out.println("4. Quick Sort");
                System.out.println("5. Addition of polynomial");
                break;
        }
     }
}