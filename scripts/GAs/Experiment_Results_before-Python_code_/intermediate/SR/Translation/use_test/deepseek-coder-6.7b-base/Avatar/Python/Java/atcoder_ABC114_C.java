```

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(aaa(n, "0"));
    }

    public static int aaa(int n, String s) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ans = 1;
        if (s.matches("[753]+")) {
            ans = 0;
        }
        for (char c : "753".toCharArray()) {
            ans += aaa(n, s + c);
        }
        return ans;
    }
}

```

