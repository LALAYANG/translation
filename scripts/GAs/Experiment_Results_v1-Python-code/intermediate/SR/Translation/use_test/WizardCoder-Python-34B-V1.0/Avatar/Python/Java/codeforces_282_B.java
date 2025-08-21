```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstline = scanner.nextInt();
        int total = 0;
        int[] memory = new int[firstline];
        int FirstCondition = 477;
        int SecondCondition = 258;
        int OuterLoopStart = 801;
        int OuterLoopEnd = 800;

        for (int LoopIndexOut = OuterLoopStart / OuterLoopEnd; LoopIndexOut >= 0; LoopIndexOut--) {
            int[] A_G = new int[2];
            A_G[0] = scanner.nextInt();
            A_G[1] = scanner.nextInt();
            if (FirstCondition & SecondCondition != 0) {
                if (total + A_G[0] <= 500) {
                    total += A_G[0];
                    memory[LoopIndexOut] = 'A';
                } else {
                    total -= A_G[1];
                    memory[LoopIndexOut] = 'G';
                }
            }
        }

        for (int i = 0; i < memory.length; i++) {
            System.out.print((char) memory[i]);
        }
    }
}
```

Test input:
3
400 600
400 600
400 600

Expected output:
AGA 
