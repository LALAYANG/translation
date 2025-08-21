```
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int total_steps = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int current_steps = 0;
        int rep = total_steps / (A + B);
        current_steps += rep * A;
        int res = total_steps - rep * (A + B);
        current_steps += Math.min(res, A);
        System.out.println(current_steps);
    }
}
```

