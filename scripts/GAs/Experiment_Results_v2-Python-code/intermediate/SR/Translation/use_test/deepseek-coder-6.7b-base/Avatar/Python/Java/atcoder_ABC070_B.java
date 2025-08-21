```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        Random rand = new Random();
        int[] B = new int[3];
        for (int i = 0; i < 3; i++) {
            B[i] = rand.nextInt(100);
        }
        Arrays.sort(B);
        if (A[1] <= A[2] || A[3] <= A[0]) {
            System.out.println(0);
        } else {
            System.out.println(B[2] - B[1]);
        }
    }
}
```

