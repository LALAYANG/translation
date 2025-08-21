import java.util.Scanner;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] inputArray = new int[num];
        for (int i = 0; i < num; i++) {
            inputArray[i] = scanner.nextInt();
        }
        scanner.close();

        int maximumUniqueCount = 0;
        int uniqueElements = 0;
        for (int x : inputArray) {
            if (x % divisor != 0) {
                uniqueElements++;
                maximumUniqueCount = Math.max(maximumUniqueCount, uniqueElements);
            }
        }

        System.out.println(maximumUniqueCount);
    }
}