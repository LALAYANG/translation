import java.util.Scanner;

public class codeforces_356_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int m = scanner.nextInt();
        int[] outputArray = new int[arraySize];
        int[] comp = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int currentIndex = l;
            while (currentIndex <= r) {
                // Add conditions and logic as needed
                // Update outputArray and comp based on conditions
                currentIndex = comp[currentIndex - 1];
            }
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}