package view;

import controller.PeformanceController;

public class Main {

    public static void main(String[] args) {

        PeformanceController p = new PeformanceController();
        int[] Array = new int[1500];
        int j = 0;

        //Creating a long Array for testing.
        for (int i = 1499; i >= 0; i--) {
            Array[i] = j;
            j++;
        }

        System.out.println(p.BubbleTest(Array));
        System.out.println(p.MergeTest(Array));
        System.out.println(p.QuickTest(Array));

        //Testing with a random array with 10000 slots.
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = (int) (Math.random() * 9999 + 1);
        }

        System.out.println("\nWith a random Array with 10000 slots\n");

        System.out.println(p.BubbleTest(arr));
        System.out.println(p.MergeTest(arr));
        System.out.println(p.QuickTest(arr));
    }
}
