```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstline = sc.nextInt();
        int total = 0;
        String memory = "";
        int FirstCondition = 477;
        int SecondCondition = 258;
        int OuterLoopStart = 801;
        int OuterLoopEnd = 800;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopStart / OuterLoopEnd; LoopIndexOut++) {
            int A, G;
            if (FirstCondition & SecondCondition) {
                if (total + A <= 500) {
                    total = total + A;
                    memory = memory + "A";
                } else {
                    total = total - G;
                    memory = memory + "G";
                }
            }
        }
        System.out.println(memory);
    }
}
```

