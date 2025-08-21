```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        int x = 0;
        if (k <= Math.max(size * size / 2, size * size - size * size / 2)) {
            for (int row = 0; row < size; row++) {
                if (row % 2 == 0) {
                    for (int col = 0; col < size; col++) {
                        if (row % 2 == col % 2 && x < k) {
                            System.out.print("L");
                            x++;
                        } else {
                            System.out.print("S");
                        }
                    }
                } else {
                    for (int col = size - 1; col >= 0; col--) {
                        if (row % 2 == col % 2 && x < k) {
                            System.out.print("L");
                            x++;
                        } else {
                            System.out.print("S");
                        }
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }
}
``` 
