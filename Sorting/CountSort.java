public class CountSort {
    static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void basicCount(int arr[]) {
        int max = findMax(arr);
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[j++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 4, 5, 2, 2, 5 };
        basicCount(a);
        display(a);
    }
}
