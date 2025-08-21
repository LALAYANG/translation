```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int check123 = 870;
        int check223 = 537;
        int check121 = 441;
        int check221 = 816;
        int check119 = 196;
        int check219 = 783;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] low = new int[n];
        int[] highs = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            low[i] = a;
            highs[i] = b;
        }
        Arrays.sort(low);
        Arrays.sort(highs);
        if ((check123 & check223) != 0 && (check121 & check221) != 0 && (check119 & check219) != 0) {
            if (n % 2 == 1) {
                System.out.println(highs[n / 2] - low[n / 2] + 1);
            } else {
                int high_mid = (highs[n / 2 - 1] + highs[n / 2]) / 2;
                int ll = (low[n / 2 - 1] + low[n / 2]) / 2;
                System.out.println(high_mid - ll + 1);
            }
        }
    }
}
```

Test input:
115044
787430935 930572076
43293210 8022462
54493048 609541870
412754672 483376059
780622034 989357009
93681885 935237112
306850579 938607106
378774953 480709097
199784654 957170958
284499920 410154651
384984093 875737736
25220448 377189387
150920760 791475176
89273309 536110671
554904908 579287997
32428902 928194403
303050212 747191613
529396104 989591906
230052756 364631710
587252351 937463357
824706857 989715942
101176768 867225143
181947606 214386621
175612007 676265585
19349844 98226250

Expected output:
825123302
``` 
