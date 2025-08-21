```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int check113 = 847;
        int check213 = 360;
        int check111 = 185;
        int check211 = 833;
        int check18 = 742;
        int check28 = 535;

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] integerList = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            integerList[i] = Integer.parseInt(input[i]);
        }

        if ((check113 & check213) != 0 && (check111 & check211) != 0 && (check18 & check28) != 0) {
            if (integerList[1] <= integerList[2] || integerList[3] <= integerList[0]) {
                System.out.println(0);
            } else {
                Arrays.sort(integerList);
                System.out.println(integerList[2] - integerList[1]);
            }
        }
    }
}
```

Test input:
0 50 50 100

Expected output:
0 
