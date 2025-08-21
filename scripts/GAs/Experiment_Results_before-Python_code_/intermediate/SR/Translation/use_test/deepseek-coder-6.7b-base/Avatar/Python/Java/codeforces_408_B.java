
```

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (map.containsKey(c) && map.get(c) > 0) {
                count++;
                map.put(c, map.get(c) - 1);
            }
        }
        System.out.println(count);
    }
}

```

### Explanation:

```

The first line of input is the string of colors that the programmer has bought.
The second line of input is the string of colors that the programmer has made.
The programmer can only buy colors that he has not made.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that he has bought.
The programmer can only make colors that
