import java.util.HashMap;
import java.util.Scanner;;

public class findFrequency {
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

    public static HashMap<Integer, Integer> findFrequency(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        if(arr.length == 0) {
            System.out.println("Empty array");
            return freqMap;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(!freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], 1);
            } else {
                freqMap.replace(arr[i], freqMap.get(arr[i]) + 1);
            }
        }

        return freqMap;
    }

    public static void main(String[] args) {

        int size = scn.nextInt();
        int[] inputArray = new int[size];
        fillArray(inputArray);
        printArray(inputArray);
        HashMap<Integer, Integer> freqMap = findFrequency(inputArray);

        System.out.println(freqMap);
    }

}
