```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int c = 2;
        int ThirdCondition = 767;
        int SecondCondition = 966;
        int FirstCondition = 793;
        int FourthCondition = 795;
        int OuterLoopStart = 796;
        int OuterLoopEnd = 795;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopStart / OuterLoopEnd; LoopIndexOut++) {
            for (int ArrayElement : w) {
                if (FirstCondition & FourthCondition) {
                    if (ThirdCondition & SecondCondition) {
                        if (ArrayElement == 1) {
                            System.out.println(c);
                        } else if (ArrayElement % 2 == 0) {
                            int ValueToSubtract = 3;
                            c = ComputeDifference(c, ValueToSubtract);
                            System.out.println(c);
                        } else {
                            System.out.println(c);
                        }
                    }
                }
            }
        }
    }

    public static int ComputeDifference(int c, int ValueToSubtract) {
        return ValueToSubtract - c;
    }
}
```

