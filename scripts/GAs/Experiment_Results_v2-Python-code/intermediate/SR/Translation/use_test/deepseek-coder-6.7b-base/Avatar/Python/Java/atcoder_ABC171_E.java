```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int inputCount = sc.nextInt();
        int[] inputNumbers = new int[inputCount];
        for (int i = 0; i < inputCount; i++) {
            inputNumbers[i] = sc.nextInt();
        }
        int xorTotal = reduce(xor, inputNumbers, 0);
        for (int i = 0; i < inputCount; i++) {
            System.out.print(bitwiseXor(inputNumbers[i], xorTotal) + " ");
        }
    }

    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }

    public static int reduce(int[] inputNumbers, int xorTotal, int i) {
        if (i == inputNumbers.length) {
            return xorTotal;
        }
        return reduce(inputNumbers, xorTotal ^ inputNumbers[i], i + 1);
    }
}
```

