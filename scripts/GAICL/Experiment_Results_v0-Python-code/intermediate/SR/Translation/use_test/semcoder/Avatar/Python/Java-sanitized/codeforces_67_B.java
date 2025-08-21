import java.util.Scanner;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values for n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Read input array of numbers
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Perform operations on the numbers array
        for (int j = 0; j < n; j++) {
            for (int index = 0; index < n; index++) {
                if (numbers[index] == 0) {
                    System.out.print(index + 1 + " ");
                    break;
                }
            }
            for (int l = 0; l < n; l++) {
                numbers[l] -= 1;
            }
            numbers[index] -= 1;
        }
    }
}