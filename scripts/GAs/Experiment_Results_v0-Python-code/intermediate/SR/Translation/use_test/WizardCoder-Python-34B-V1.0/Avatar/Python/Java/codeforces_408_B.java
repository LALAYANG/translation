```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        int[] bought_count = new int[26];
        int[] made_cout = new int[26];
        for (int i = 0; i < line1.length(); i++) {
            bought_count[line1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < line2.length(); i++) {
            made_cout[line2.charAt(i) - 'a']++;
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
            res += Math.min(bought_count[i], made_cout[i]);
        }
        System.out.println(res);
    }
}
```

Test input:
bbzmzqazmbambnmzaabznmbabzqnaabmabmnnabbmnzaanzzezebzabqaabzqaemeqqammmbazmmz
aznnbbmeebmanbeemzmemqbaeebnqenqzzbanebmnzqqebqmmnmqqzmmeqqqaaezemmazqqmqaqnnqqzbzeeazammmenbbamzbmnaenemenaaaebnmanebqmqnznqbenmqqnnnaeaebqmamennmqqeaaqqbammnzqmnmqnqbbezmemznqmanzmmqzzzzembqnzqbanamezqaqbazenenqqznqaebzaeezbqqbmeeaqnmmbnqbbnmaqqemaeaezaabmbnbzzaae

Expected output:
77
``` 
