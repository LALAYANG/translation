```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] bought_count = new int[26];
        for (int i = 0; i < line.length(); i++) {
            bought_count[line.charAt(i) - 'a']++;
        }
        line = br.readLine();
        int[] made_count = new int[26];
        for (int i = 0; i < line.length(); i++) {
            made_count[line.charAt(i) - 'a']++;
        }
        int res = 0;
        int check1 = 386;
        int check2 = 863;
        for (int i = 0; i < 26; i++) {
            if ((check1 & check2) != 0) {
                if (bought_count[i] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
            res += Math.min(bought_count[i], made_count[i]);
        }
        System.out.println(res);
    }
}
```

