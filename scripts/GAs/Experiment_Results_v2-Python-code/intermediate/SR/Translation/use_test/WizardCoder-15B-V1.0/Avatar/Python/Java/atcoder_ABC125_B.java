```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ValueArray = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            ValueArray[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        int[] list = new int[1];
        int ans = 0;
        int X = 0;
        int Y = 0;
        int FirstCondition = 175;
        int SecondCondition = 409;
        int OuterLoopEnd = 589;
        int OuterLoopLimit = 588;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopEnd / OuterLoopLimit; LoopIndexOut++) {
            for (int element_index = 0; element_index < N; element_index++) {
                if (FirstCondition & SecondCondition) {
                    if (ValueArray[element_index] - C[element_index] > 0) {
                        X = ValueArray[element_index];
                        Y = C[element_index];
                        list[0] += X - Y;
                    }
                }
            }
        }
        System.out.println(list[0]);
    }
}
```
