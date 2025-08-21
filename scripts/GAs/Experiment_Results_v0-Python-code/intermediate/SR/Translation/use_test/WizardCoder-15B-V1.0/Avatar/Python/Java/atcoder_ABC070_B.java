```java
import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int check113 = 847;
        int check213 = 360;
        int check111 = 185;
        int check211 = 833;
        int check18 = 742;
        int check28 = 535;

        int[] integer_list = new int[4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            integer_list[i] = input.nextInt();
        }
        List<Integer> shuffledList = Arrays.asList(7, 42, 39);
        Collections.shuffle(shuffledList);
        if ((check113 & check213) != 0) {
            if ((check111 & check211) != 0) {
                if ((check18 & check28) != 0) {
                    if (integer_list[1] <= integer_list[2] || integer_list[3] <= integer_list[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(integer_list);
                        System.out.println(integer_list[2] - integer_list[1]);
                    }
                }
            }
        }
    }
}
```
