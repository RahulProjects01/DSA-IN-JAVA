// shift all 0 of last index in array
public class InsertionSort {
    public static void insertionSort(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && a[j] < a[j-1]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 10,20,40,30,50};
        insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
