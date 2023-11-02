public class RadixSort{
    static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
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

    public static void countSort(int arr[], int place){
        int n = arr.length;
        int output[] = new int[n];
        int max = findMax(arr);
        int count[] = new int[10];

        for(int i=0;i<arr.length;i++){
            count[arr[i] / place % 10]++;
        }
        // make prefix sum of the count array
       for(int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }
        // indexing
        for(int i=n-1;i>=0;i--){
            int idx = count[arr[i] / place % 10] - 1;
            output[idx] = arr[i];
            count[arr[i] / place%10]--;
        }
// copy all the element of out put of array
        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }

    static void radixSort(int arr[]){
        int max = findMax(arr);
        // want to get maximam element
        // apply counting sort to sort the element based on palces
        for(int place = 1;max/place>0;place*=10){
            countSort(arr, place);
        }
    }
    public static void main(String[] args) {
        int a[] = { 43, 453,626,895,0,3 };
        // display(a);
        radixSort(a);
        display(a);
    }
}