```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedListLength = scanner.nextInt();
        int[] firstInputList = new int[expectedListLength];
        int[] y = new int[expectedListLength];
        for (int i = 0; i < expectedListLength; i++) {
            firstInputList[i] = scanner.nextInt();
        }
        for (int i = 0; i < expectedListLength; i++) {
            y[i] = scanner.nextInt();
        }
        int thirdValueFilter = firstInputList[0];
        int fourthValueFilter = y[0];
        int firstValueFilter = firstInputList[1];
        int secondValueFilter = y[1];
        int fifthValueFilter = firstInputList[2];
        int sixthValueFilter = y[2];
        int seventhValueFilter = firstInputList[3];
        int eighthValueFilter = y[3];
        int[] z = new int[expectedListLength];
        int k = 0;
        for (int i = 0; i < expectedListLength; i++) {
            if (firstInputList[i] != 0) {
                z[k] = firstInputList[i];
                k++;
            }
        }
        for (int i = 0; i < expectedListLength; i++) {
            if (y[i] != 0) {
                z[k] = y[i];
                k++;
            }
        }
        if (thirdValueFilter & fourthValueFilter) {
            if (firstValueFilter & secondValueFilter) {
                if (z.length != expectedListLength) {
                    System.out.println("Oh, my keyboard!");
                } else {
                    System.out.println("I become the guy.");
                }
            }
        }
    }
}
```

