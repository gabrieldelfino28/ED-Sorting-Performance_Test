package controller;

import br.edu.fateczl.algoritmos.bubblesort.BubbleSort;
import br.edu.fateczl.algoritmos.mergesort.MergeSort;
import br.edu.fateczl.algoritmos.quicksort.QuickSort;

public class PeformanceController {
    public PeformanceController() {
        super();
    }

    public String BubbleTest(int[] arr){
        BubbleSort sort = new BubbleSort();

        double start = System.nanoTime();
        int[] sortedArr = sort.BubbleSort(arr);
        double end = System.nanoTime();

        double duration = (end - start);
        duration /= Math.pow(10,9);
        return "Bubble: "+duration+ " ms";
    }

    public String MergeTest(int[] arr){
        MergeSort sort = new MergeSort();
        int end = arr.length - 1;

        double start = System.nanoTime();
        int[] sortedArr = sort.MergeSort(arr,0,end);
        double endT = System.nanoTime();

        double duration = (endT - start);
        duration /= Math.pow(10,9);
        return "Merge: "+duration+ " seconds";
    }

    public String QuickTest(int[] arr){
        QuickSort sort = new QuickSort();
        int end = arr.length - 1;

        double start = System.nanoTime();
        int[] sortedArr = sort.QuickSort(arr,0,end);
        double endT = System.nanoTime();

        double duration = (endT - start);
        duration /= Math.pow(10,9);

        return "Quick: "+duration+ " seconds";
    }
}
