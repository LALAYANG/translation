```java
import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String word : s) {
            w.put(word, w.getOrDefault(word, 0) + 1);
        }
        String[] s_rev = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            s_rev[i] = s[s.length - 1 - i];
        }
        int c = -1, a = 0;
        for (String word : w.keySet()) {
            if (w.get(word) == Collections.max(w.values())) {
                if (Arrays.asList(s_rev).indexOf(word) > c) {
                    a = word;
                    c = Arrays.asList(s_rev).indexOf(word);
                }
            }
        }
        System.out.println(a);
    }
}
```
