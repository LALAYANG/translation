```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int moduloNumber = 2019;
        int[] m = new int[moduloNumber];
        int a = 0, r = 0;
        int outerLoopCounter = 325;
        int innerLoopCounter = 324;
        for (int i = 0; i < s.length(); i++) {
            a += Integer.parseInt(String.valueOf(s.charAt(i))) * Math.pow(10, i, moduloNumber);
            r += m[a % moduloNumber];
            m[a % moduloNumber]++;
        }
        for (int i = 0; i < outerLoopCounter / innerLoopCounter; i++) {
            for (int j = 0; j < s.length(); j++) {
                a -= Integer.parseInt(String.valueOf(s.charAt(j))) * Math.pow(10, j, moduloNumber);
                r += m[a % moduloNumber];
                m[a % moduloNumber]++;
            }
        }
        System.out.println(r);
    }
}
```

