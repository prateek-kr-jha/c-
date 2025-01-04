import java.util.Scanner;
import java.util.ArrayList;

public class removeDuplicate {
    public static Scanner scn = new Scanner(System.in);

    public static void fillArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n && scn.hasNext()) {
            arr[i] = scn.nextInt();
            i++;
        }

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // public static void mergeSort(int[] arr, int i, int j) {
    //     if(i = j) {
    //         return;
    //     }
    // }
    public static void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        for(int k = lo; k <= hi; k++) {
            aux[k] = arr[k];
        }

        for(int k = lo; k <= hi; k++) {
            System.out.println(k + " : i " + i + " : j " + j);
            if(i > mid) {
                arr[k] = aux[j++];
            } else if(j > hi) {
                arr[k] = aux[i++];
            } else if(aux[j] < aux[i]) {
                arr[k] = aux[j++]; 
            } else {
                arr[k] = aux[i++];
            } 
        }
        printArray(arr);
    }

    public static void main(String[] args) {

        int size = scn.nextInt();
        int[] inputArray = new int[size];
        int[] aux = new int[size];
        int mid = size/2;
        // System.out.println(mi);
        fillArray(inputArray);
        printArray(inputArray);
        merge(inputArray, aux, 0, mid, size - 1);
        printArray(inputArray);

    }
}
