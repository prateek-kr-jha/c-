import java.util.Scanner;
import java.util.ArrayList;

public class removeDuplicate {
    public static Scanner scn = new Scanner(System.in);
    private static int[] aux;

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

    public static void mergeSort(int[] arr) {
        aux = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int lo, int hi) {
        if(hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        mergeSort(arr, lo, mid);
        mergeSort(arr,  mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    public static void merge(int[] arr, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        for(int k = lo; k <= hi; k++) {
            aux[k] = arr[k];
        }

        for(int k = lo; k <= hi; k++) {
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
    }

    public static void main(String[] args) {

        int size = scn.nextInt();
        int[] inputArray = new int[size];

        // System.out.println(mi);
        fillArray(inputArray);
        printArray(inputArray);
        mergeSort(inputArray);
        printArray(inputArray);

    }
}
