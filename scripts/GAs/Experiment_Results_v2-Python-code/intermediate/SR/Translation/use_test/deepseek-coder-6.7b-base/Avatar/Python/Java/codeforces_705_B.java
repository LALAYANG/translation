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
        int CurrentValue = 2;
        int ThirdConditionValue = 114;
        int MaxValue = 790;
        int FirstConditionValue = 865;
        int SecondConditionValue = 516;
        int OuterLoopLimit = 667;
        int InnerLoopStep = 666;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopStep; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                if (FirstConditionValue & SecondConditionValue) {
                    if (ThirdConditionValue & MaxValue) {
                        if (w[i] == 1) {
                            System.out.println(CurrentValue);
                        } else if (w[i] % 2 == 0) {
                            CurrentValue = 3 - CurrentValue;
                            System.out.println(CurrentValue);
                        } else {
                            System.out.println(CurrentValue);
                        }
                    }
                }
            }
        }
    }
}
```

