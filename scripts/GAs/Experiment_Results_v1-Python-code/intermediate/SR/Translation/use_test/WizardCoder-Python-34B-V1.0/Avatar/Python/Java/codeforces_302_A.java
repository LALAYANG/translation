```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = scanner.nextLine().replaceAll("[^\\-]", "").length();
        sa = Math.min(n - sa, sa);
        String[] resultsList = new String[m];

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int difference = b - a;
            boolean isEven = difference % 2 == 0;
            boolean isWithinRange = difference <= sa * 2;
            resultsList[i] = (isEven && isWithinRange) ? "1\n" : "0\n";
        }

        for (String result : resultsList) {
            System.out.print(result);
        }
    }
}
``` 
