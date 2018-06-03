package com.sorting;

public class SortLogic {
    private int[] list;
    //Bubble Sort Function
    public void sortListByBubbleSort() {
        //https://www.geeksforgeeks.org/bubble-sort/
        SortUtilities.printList(list);
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length-i-1; j++) {
                System.out.println("second loop End till" + (list.length-i-1));
                if(list[j]>list[j+1]) {
                    System.out.println("Swip True list[j]>list[i]: "+list[j]+" > "+list[i]);
                    SortUtilities.swap(j, j+1, list);
                }
                SortUtilities.printList(list);
            }
        }
    }

    //Insertion Sort Function
    public void sortListByInsertionSort() {
        //https://www.geeksforgeeks.org/insertion-sort/
        SortUtilities.printList(list);
        for (int i = 1; i<list.length; i++) {
            int firstUnsortedElement = list[i];
            int j = i - 1;
            while (j>=0 && list[j]>firstUnsortedElement) {
                list[j+1]=list[j];
                j -= 1;
            }
            list[j+1] = firstUnsortedElement;
        SortUtilities.printList(list);
        }
    }

    //Selection Sort Function
    public void sortListBySelectionSort() {
        //https://www.geeksforgeeks.org/selection-sort/
        SortUtilities.printList(list);
        for (int i=0; i<list.length-1; i++) {
        //Define element be min of all to initiate to find the min of the loop
            int minElement = i;
            System.out.println("Position: " + minElement);
            System.out.println("sortListBySelectionSort: pre min value" + list[minElement]);
            for(int j=i+1; j<list.length; j++) {
                if(list[j] < list[minElement]) {
                    minElement = j;
                }
            }
            System.out.println("sortListBySelectionSort: post min value" + list[minElement]);
            SortUtilities.swap(minElement, i, list);
            SortUtilities.printList(list);
        }
    }

    /**
     * Quick Sort Function
     * @param start of the partitioned list
     * @param end of the partitioned list
     **/
    public void sortListByQuickSort(int start, int end) {
        if (start < end) {
            int partionIndex = getPartition(start, end);
            sortListByQuickSort(start, partionIndex-1);
            sortListByQuickSort(partionIndex + 1, end);
        }
    }

    /**
     * 
     * @param start of the list
     * @param end of the list
     * @return pivotIndex Pivot Index 
     */
    private int getPartition(int start, int end) {
        int pivot = list[end],
            pivotIndex = start;
        SortUtilities.printList(list);
        for(int i=start; i<end; i++) {
            if(list[i]<=pivot) {
                SortUtilities.swap(i, pivotIndex, list);
                pivotIndex++;
            }
        }
        SortUtilities.swap(pivotIndex, end, list);
        return pivotIndex;
    }

    public int[] getList() { return list; }

    public void setList(int[] list) { this.list = list; }
}
