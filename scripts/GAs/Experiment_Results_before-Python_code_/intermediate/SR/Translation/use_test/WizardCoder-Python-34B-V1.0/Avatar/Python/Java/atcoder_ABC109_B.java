```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> s = new HashMap<>();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.next());
        }
        String f = "Yes";
        int i = -1;
        for (String v : l) {
            int count = s.getOrDefault(v, 0);
            s.put(v, count + 1);
            if (count >= 2) {
                f = "No";
            }
            if (i != -1 && l.get(i).charAt(l.get(i).length() - 1) != l.get(i + 1).charAt(0)) {
                f = "No";
            }
            i++;
        }
        System.out.println(f);
    }
}
```

Test input:
9
basic
c
cpp
php
python
nadesico
ocaml
lua
assembly

Expected output:
Yes 
