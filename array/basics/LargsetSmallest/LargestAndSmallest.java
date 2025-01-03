package array.basics.LargsetSmallest;
import java.util.Scanner;
import java.util.HashMap;

public class LargestAndSmallest {
    public static Scanner scn = new Scanner(System.in);

    public static void fillArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i < n && scn.hasNext()) {
            arr[i] = scn.nextInt();
            i++;
        }

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int i :  arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static HashMap<String, Integer> largestSmallest(int[] arr) {
        HashMap<String, Integer> sol = new HashMap<String, Integer>();
        int smallest = arr[0];
        int largest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }

            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        sol.put("Largest", largest);
        sol.put("Smallest", smallest);

        return sol;
        
    }

    public static void main(String[] args) {

        int size = scn.nextInt();
        int[] inputArray = new int[size];
        fillArray(inputArray);
        printArray(inputArray);
        HashMap<String, Integer> ans = largestSmallest(inputArray);
        System.out.println(ans);

    }

}