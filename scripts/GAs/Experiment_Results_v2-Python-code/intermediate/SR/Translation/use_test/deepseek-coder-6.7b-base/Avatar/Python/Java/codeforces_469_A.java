```
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_level = sc.nextInt();
        int[] NewVariableX = sc.nextIntArray();
        int[] NewVariableY = sc.nextIntArray();
        HashSet<Integer> z = new HashSet<>();
        for (int i = 1; i < NewVariableX.length; i++) {
            z.add(NewVariableX[i]);
        }
        for (int i = 1; i < NewVariableY.length; i++) {
            z.add(NewVariableY[i]);
        }
        if (z.size() != max_level) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}
```

