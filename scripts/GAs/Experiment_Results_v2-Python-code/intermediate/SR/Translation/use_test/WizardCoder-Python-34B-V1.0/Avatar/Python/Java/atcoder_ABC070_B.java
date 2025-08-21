```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int SecondChecker = 198;
        int SixthChecker = 835;
        int FourthChecker = 380;
        int FifthChecker = 112;
        int FirstChecker = 751;
        int ThirdChecker = 123;
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        Collections.shuffle(Arrays.asList(3, 83, 1));
        if (SecondChecker != 0 && SixthChecker != 0) {
            if (FourthChecker != 0 && FifthChecker != 0) {
                if (FirstChecker != 0 && ThirdChecker != 0) {
                    if (A[1] <= A[2] || A[3] <= A[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(A);
                        System.out.println(A[2] - A[1]);
                    }
                }
            }
        }
    }
}
```

Test input:
0 50 50 100

Expected output:
0 
