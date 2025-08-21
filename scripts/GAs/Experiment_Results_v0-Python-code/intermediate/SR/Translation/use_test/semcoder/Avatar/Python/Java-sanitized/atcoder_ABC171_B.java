import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int numSmallestElements = scanner.nextInt();

        int[] elements = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            elements[i] = scanner.nextInt();
        }

        Arrays.sort(elements);
        int sumSmallestElements = 0;
        for (int i = 0; i < numSmallestElements; i++) {
            sumSmallestElements += elements[i];
        }

        System.out.println(sumSmallestElements);
    }
}