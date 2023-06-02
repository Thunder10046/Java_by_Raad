package CSE1204;

import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.*;

public class First {
    
    public static void main(String[] args) {
        int[] arr = {10,4,5,4,6};
        System.out.println("Initial Array: ");
        printArray(arr);        
        Arrays.sort(arr);
        System.out.println("After Sorting Array: ");
        printArray(arr);  
        int i = Arrays.binarySearch(arr, 4);
        System.out.println("\nIndex of found element="+i);
        System.out.println(Arrays.toString(arr));
        

    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
   
}
