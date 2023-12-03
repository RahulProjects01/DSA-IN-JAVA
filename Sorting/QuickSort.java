public class QuickSort {
    static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static int parition(int arr[], int st, int end) {
        int pivot = arr[st];
        int cnt = 0;
        for (int i = st + 1; i < end; i++) {
            if (arr[i] < pivot) {
                cnt++;
            }
        }
        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);
        int i = st;
        int j = end;
        while (j < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, pivotIdx, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quickSort(int arr[], int st, int end) {
        if (st >= end) {
            return;
        }
        int pi = parition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    public static void main(String[] args) {
        int a[] = { 6, 3, 1, 5, 4 };
        display(a);
        quickSort(a, 0, a.length);
        display(a);
    }
}
