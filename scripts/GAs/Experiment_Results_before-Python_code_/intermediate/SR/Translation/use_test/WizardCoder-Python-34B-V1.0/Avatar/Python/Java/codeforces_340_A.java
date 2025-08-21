```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] l = scanner.nextLine().split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);

        int gcd(int a, int b) {
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
            return b;
        }

        int lcm(int a, int b) {
            return a * b / gcd(a, b);
        }

        int lcmValue = lcm(x, y);
        int result = b / lcmValue - ((a - 1) / lcmValue);
        System.out.println(result);
    }
}
``` 
