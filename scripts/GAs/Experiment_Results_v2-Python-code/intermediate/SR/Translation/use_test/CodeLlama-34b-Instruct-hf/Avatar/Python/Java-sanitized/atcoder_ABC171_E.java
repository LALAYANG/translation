import java.util.Scanner;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCount = sc.nextInt();
        int[] inputNumbers = new int[inputCount];
        for (int i = 0; i < inputCount; i++) {
            inputNumbers[i] = sc.nextInt();
        }
        int xorTotal = 0;
        for (int i = 0; i < inputCount; i++) {
            xorTotal ^= inputNumbers[i];
        }
        for (int i = 0; i < inputCount; i++) {
            System.out.print(bitwiseXor(inputNumbers[i], xorTotal) + " ");
        }
    }

    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }
}