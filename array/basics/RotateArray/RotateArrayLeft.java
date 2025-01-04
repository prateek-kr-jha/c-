import java.util.Scanner;

public class RotateArrayLeft {
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

    public static void reverseArray(int[] arr, int i, int j) {

        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }
    
    public static void rotateArrayByK(int[] arr, int k) {
        int length = arr.length;
        k = k % length;

        reverseArray(arr, 0, length - 1);
        reverseArray(arr, length - k, length - 1);
        reverseArray(arr, 0, length - k - 1);

    }

    public static int[] rotateUsingArray(int[] arr, int k) {
        k = k % arr.length;
        int[] tempArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            int idx = i - k;
            if(idx < 0) {
                idx += arr.length;
            }
            tempArr[idx] = arr[i];
        }
        return tempArr;
    }

    public static void main(String[] args) {

        int size = scn.nextInt();
        int[] inputArray = new int[size];
        fillArray(inputArray);
        int k = scn.nextInt();
        printArray(inputArray);
        System.out.println("K " + k);
        printArray(rotateUsingArray(inputArray, k));

    }

}
