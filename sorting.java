import java.util.*;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int smallestInd = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[smallestInd]) {
                    smallestInd = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[smallestInd];
            arr[smallestInd] = tmp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
