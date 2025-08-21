```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int user_health = sc.nextInt();
        int threshold_health = sc.nextInt();
        if (user_health <= threshold_health) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}
```

