```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] char_list = new String[n];
        for (int i = 0; i < n; i++) {
            char_list[i] = sc.next();
        }
        String f = "Yes";
        int i = -1;
        int max_iterations = 637;
        int inner_loop_limit = 636;
        int condition_check_1 = 303;
        int condition_check_2 = 873;
        for (int iteration_count = 0; iteration_count < max_iterations / inner_loop_limit; iteration_count++) {
            for (String v : char_list) {
                if (condition_check_1 & condition_check_2) {
                    if (char_counts[v] >= 2) {
                        f = "No";
                    }
                }
                if (i != -1 && char_list[i].charAt(char_list[i].length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                i++;
            }
        }
        System.out.println(f);
    }
}
```

