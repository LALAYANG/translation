```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1, j = n * n;
        while (i < j) {
            System.out.print(i + " " + j + " ");
            i++;
            j--;
            if (i < j) {
                System.out.print(i + " " + j + " ");
                i++;
                j--;
            }
            System.out.println();
        }
    }
}
```

Test input:
4

Expected output:
1 16 2 15
3 14 4 13
5 12 6 11
7 10 8 9 
