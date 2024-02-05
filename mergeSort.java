import java.util.*;

public class mergeSort {
    public static void merge(int[] arr, int l, int mid, int r) {
        int[] merged = new int[r - l + 1];

        int idx1 = l;
        int idx2 = mid + 1;
        int idx = 0;

        while(idx1 <= mid && idx2 <= r) {
            if(arr[idx1] < arr[idx2]) {
                merged[idx++] = arr[idx1++];
            } else {
                merged[idx++] = arr[idx2++];
            }
        }

        while(idx1 <= mid) {
            merged[idx++] = arr[idx1++];
        }

        while(idx2 <= r) {
            merged[idx++] = arr[idx2++];
        }

        for(int i = 0, j = l; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void mergeSortFunc(int[] arr, int l, int r) {
        if(l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSortFunc(arr, l, mid);
        mergeSortFunc(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSortFunc(arr, 0, n - 1);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
