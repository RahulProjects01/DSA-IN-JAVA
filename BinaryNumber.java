public class BinaryNumber {
    static void printBinary(int binary[], int id) {
        for (int i = id - 1; i >= 0; i--) {
            System.out.print(binary[i] + "");
        }
    }

    static void decimalToBinary(int num) {
        int[] binary = new int[35];
        int id = 0;

        while (num > 0) {
            binar[id++] = num % 2;
            num = num / 2;
        }
        printBinary(binary, id);
    }

    public static void main(String[] args) {
        int num = 5;
        decimalToBinary(num);
    }

}
