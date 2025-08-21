```java
import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] input_array = sc.next().split(" ");
        List<Integer> list = new ArrayList<Integer>();
        for (String s : input_array) {
            list.add(Integer.parseInt(s));
        }
        TTest tTest = new TTest();
        double pValue = tTest.tTest(list, 0.05);
        if (pValue < 0.05) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
