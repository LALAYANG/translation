```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower_check = 331;
        int upper_check = 588;
        int num_ranges = scanner.nextInt();
        int[] low = new int[num_ranges];
        int[] high = new int[num_ranges];
        for (int i = 0; i < num_ranges; i++) {
            String[] input = scanner.nextLine().split(" ");
            low[i] = Integer.parseInt(input[0]);
            high[i] = Integer.parseInt(input[1]);
        }
        Arrays.sort(low);
        Arrays.sort(high);
        if (lower_check && upper_check) {
            if (num_ranges % 2 == 1) {
                System.out.println(high[num_ranges / 2] - low[num_ranges / 2] + 1);
            } else {
                int high_midpoint = (high[num_ranges / 2 - 1] + high[num_ranges / 2]) / 2;
                int ll = (low[num_ranges / 2 - 1] + low[num_ranges / 2]) / 2;
                System.out.println(high_midpoint - ll + 1);
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
