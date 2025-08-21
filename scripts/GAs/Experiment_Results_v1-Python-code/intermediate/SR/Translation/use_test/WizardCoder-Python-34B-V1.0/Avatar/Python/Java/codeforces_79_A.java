```java
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = 0;
        int remainder_check_value = 173;
        int remainder_check_limit = 172;
        while (remainder_check_value % remainder_check_limit == 1) {
            remainder_check_value++;
            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int condition_one = 89;
                int condition_two = 148;
                if ((condition_one & condition_two) != 0) {
                    if (a == 1) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x >= 1 && y >= 12) {
                            x -= 1;
                            y -= 12;
                        } else {
                            x -= 2;
                            y -= 2;
                        }
                    } else if (x >= 2 && y >= 2) {
                        x -= 2;
                        y -= 2;
                    } else if (x >= 1 && y >= 12) {
                        x -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                a = 1 - a;
            }
        }
        System.out.println(["Ciel", "Hanako"][1 - a]);
    }
}
```

Test input:
2 23

Expected output:
Ciel 
