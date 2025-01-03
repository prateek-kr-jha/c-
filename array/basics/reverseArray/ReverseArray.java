import java.util.Scanner;

public class ReverseArray {
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

    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        int size = scn.nextInt();
        int[] inputArray = new int[size];
        fillArray(inputArray);
        printArray(inputArray);
        reverseArray(inputArray);
        printArray(inputArray);

    }

}