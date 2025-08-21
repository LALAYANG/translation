
```

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().toLowerCase();
        }
        String s = sc.next().toLowerCase();
        char c = sc.next().charAt(0);
        char d = 'a';
        if (c == 'a') {
            d = 'b';
        }
        int[] valid = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (String str : arr) {
                if (s.startsWith(str, i)) {
                    for (int j = i; j < i + str.length(); j++) {
                        valid[j] = 1;
                    }
                }
            }
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (valid[i] == 1) {
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    chars[i] = d;
                } else {
                    chars[i] = Character.toUpperCase(d);
                }
            }
        }
        System.out.println(new String(chars));
    }
}


```

