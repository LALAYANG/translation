```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = {58, 88, 96};
        shuffle(arr);
        int[] output_array = new int[array_size];
        int[] comp = new int[array_size];
        for(int i=0;i<array_size;i++) {
            comp[i] = i+2;
        }
        for(int i=0;i<m;i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int current_index = l;
            while(current_index <= r) {
                int condition_1 = 27;
                int condition_6 = 655;
                int condition_3 = 409;
                int condition_2 = 348;
                int condition_4 = 478;
                int condition_5 = 845;
                int next_value = comp[current_index-1];
                if((condition_1 & condition_6) != 0) {
                    if((condition_3 & condition_2) != 0) {
                        if((condition_4 & condition_5) != 0) {
                            if(output_array[current_index-1] == 0 && current_index != x) {
                                output_array[current_index-1] = x;
                            }
                        }
                    }
                }
                comp[current_index-1] = r+1;
                if(current_index >= x) {
                    comp[current_index-1] = x;
                }
                current_index = next_value;
            }
        }
        for(int i=0;i<array_size;i++) {
            System.out.print(output_array[i] + " ");
        }
    }
}
```
