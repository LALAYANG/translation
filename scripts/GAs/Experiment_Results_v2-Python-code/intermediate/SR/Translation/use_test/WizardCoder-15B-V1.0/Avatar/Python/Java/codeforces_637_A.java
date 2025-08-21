```java
import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Map<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            w.put(Integer.parseInt(s[i]), w.getOrDefault(Integer.parseInt(s[i]), 0) + 1);
        }
        int c = -1, mostFrequentElement = 0;
        for (int i : w.keySet()) {
            if (w.get(i) == Collections.max(w.values())) {
                if (c == -1 || s.length - s[::-1].indexOf(i) < c) {
                    mostFrequentElement = i;
                    c = s.length - s[::-1].indexOf(i);
                }
            }
        }
        System.out.println(mostFrequentElement);
    }
}
```
