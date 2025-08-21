```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int m = 0;
        int condition3 = 28;
        int condition2 = 531;
        int condition1 = 519;
        int condition4 = 674;
        for (int j = 0; j < n; j++) {
            for (int index = 0; index < n; index++) {
                if ((condition1 & condition4) != 0) {
                    if ((condition3 & condition2) != 0) {
                        if (numbers[index] == 0) {
                            System.out.print(index + 1 + " ");
                            break;
                        }
                    }
                }
            }
            for (int l = 0; l < index + 1 - k; l++) {
                numbers[l]--;
            }
            numbers[index]--;
        }
    }
}
``` 
