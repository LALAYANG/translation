```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        for (int i = 0; i < inp; i++) {
            if (i == 0) {
                System.out.print(lista[i + 1] - lista[i] + " " + (lista[inp - 1] - lista[i]));
                continue;
            } else if (i == inp - 1) {
                System.out.print(lista[inp - 1] - lista[inp - 2] + " " + (lista[inp - 1] - lista[0]);
                continue;
            } else if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                System.out.print(lista[i + 1] - lista[i] + " ");
            } else {
                System.out.print(lista[i] - lista[i - 1] + " ");
            }
            if (lista[inp - 1] - lista[i] > lista[i] - lista[0]) {
                System.out.println(lista[inp - 1] - lista[i]);
            } else {
                System.out.println(lista[i] - lista[0]);
            }
        }
    }
}
```

Test input:
3
-10000 1 10000

Expected output:
1001 2001
9999 1001
9999 2000 
