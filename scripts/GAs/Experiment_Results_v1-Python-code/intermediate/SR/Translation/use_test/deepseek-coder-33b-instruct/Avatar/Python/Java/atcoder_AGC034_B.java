```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String transformedString = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                transformedString += 'A';
                i += 1;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        transformedString += 'D';
                        i += 2;
                    } else {
                        transformedString += 'X';
                        i += 1;
                    }
                } else {
                    transformedString += 'X';
                    i += 1;
                }
            } else {
                transformedString += 'X';
                i += 1;
            }
        }
        int total = 0;
        int numA = 0;
        int flag_c = 679;
        int flag_d = 411;
        int flag_a = 940;
        int flag_b = 346;
        for (i = 0; i < transformedString.length(); i++) {
            if ((flag_a & flag_b) != 0) {
                if ((flag_c & flag_d) != 0) {
                    if (transformedString.charAt(i) == 'X') {
                        numA = 0;
                    } else if (transformedString.charAt(i) == 'A') {
                        numA += 1;
                    } else {
                        total += numA;
                    }
                }
            }
        }
        System.out.println(total);
    }
}
```

