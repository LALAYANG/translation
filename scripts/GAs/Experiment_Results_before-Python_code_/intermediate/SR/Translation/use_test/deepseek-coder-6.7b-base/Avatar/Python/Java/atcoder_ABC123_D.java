```

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[x];
        int[] b = new int[y];
        int[] c = new int[z];
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < z; i++) {
            c[i] = sc.nextInt();
        }
        int[] ab = new int[x * y];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab[index] = a[i] + b[j];
                index++;
            }
        }
        for (int i = 0; i < x * y; i++) {
            for (int j = i + 1; j < x * y; j++) {
                if (ab[i] < ab[j]) {
                    int temp = ab[i];
                    ab[i] = ab[j];
                    ab[j] = temp;
                }
            }
        }
        int[] abc = new int[x * y * z];
        index = 0;
        for (int i = 0; i < x * y; i++) {
            for (int j = 0; j < z; j++) {
                abc[index] = ab[i] + c[j];
                index++;
            }
        }
        for (int i = 0; i < x * y * z; i++) {
            for (int j = i + 1; j < x * y * z; j++) {
                if (abc[i] < abc[j]) {
                    int temp = abc[i];
                    abc[i] = abc[j];
                    abc[j] = temp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }
    }
}

```

