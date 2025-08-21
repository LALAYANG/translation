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
                int condition1 = 27;
                int condition2 = 655;
                int condition3 = 409;
                int condition4 = 348;
                int condition5 = 478;
                int condition6 = 845;
                int nextValue = comp[currentIndex - 1];
                if (condition1 & condition2) {
                    if (condition3 & condition4) {
                        if (condition5 & condition6) {
                            if (outputArray[currentIndex - 1] == 0 && currentIndex != x) {
                                outputArray[currentIndex - 1] = x;
                            }
                        }
                    }
                }
                comp[currentIndex - 1] = r + 1;
                currentIndex = nextValue;
            }
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}