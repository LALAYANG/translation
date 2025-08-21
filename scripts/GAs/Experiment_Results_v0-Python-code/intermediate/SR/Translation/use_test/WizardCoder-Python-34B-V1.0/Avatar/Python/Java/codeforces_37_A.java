```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        java.util.Arrays.sort(l);

        for (int i = 0; i < n; i++) {
            if (i > 0 && l[i] == l[i - 1]) {
                int decrement_amount = 1;
                int decremented_tower = tower - decrement_amount;
                tower = decremented_tower;
                int increment_amount = 1;
                high += increment_amount;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }

        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}
``` 
