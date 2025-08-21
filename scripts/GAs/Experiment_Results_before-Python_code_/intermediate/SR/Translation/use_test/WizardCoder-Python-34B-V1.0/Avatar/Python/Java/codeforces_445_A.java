```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            char[] sArray = s.toCharArray();
            for (int j = 0; j < m; j++) {
                if (sArray[j] == '.') {
                    if ((i + j) % 2 == 0) {
                        sArray[j] = 'W';
                    } else {
                        sArray[j] = 'B';
                    }
                }
            }
            l[i] = new String(sArray);
        }
        for (String s : l) {
            System.out.println(s);
        }
    }
}
```

Test input:
2 5
.....
.....

Expected output:
BWBWB
WBWBW 
