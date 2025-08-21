```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_nodes = sc.nextInt();
        int K = sc.nextInt();
        int[] L = new int[num_nodes + 1];
        for (int i = 0; i < num_nodes; i++) {
            L[i] = sc.nextInt();
        }
        int[] path = new int[num_nodes + 1];
        path[0] = 1;
        int current_index = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> Hash = new HashMap<>();
        int bitmask1 = 524;
        int bitmask2 = 239;
        int divisor = 63;
        int remainder = 357;
        int check1 = 986;
        int check2 = 878;
        int mask1 = 733;
        int mask2 = 172;
        for (int i = 1; i <= num_nodes; i++) {
            int ne = L[x];
            if ((bitmask1 & bitmask2) != 0) {
                if (Hash.containsKey(ne)) {
                    flag = true;
                    t = Hash.get(ne);
                    break;
                }
            }
            path[i] = ne;
            current_index++;
            Hash.put(ne, current_index);
            x = ne;
        }
        if ((check1 & check2) != 0) {
            if ((divisor & remainder) != 0) {
                if (flag) {
                    List<Integer> loop = Arrays.asList(Arrays.copyOfRange(path, t, num_nodes + 1));
                    if (K < path.length) {
                        System.out.println(path[K]);
                    } else {
                        K = K - path.length;
                        K = K % loop.size();
                        System.out.println(loop.get(K));
                    }
                } else {
                    System.out.println(path[K - 1]);
                }
            }
        }
    }
}
```

Test input:
200000 678997213818168535
140886 128672 33402 11644 123530 161027 39102 30769 197426 72320 32833 125861 22468 193821 16575 152351 159129 84407 122672 164940 70334 98352 61192 191235 172441 31891 38470 95911 175200 8103 149755 189419 56967 84 3730 168976 13738 140006 112957 95521 133407 3623 45055 149548 165094 33840 197921 198081 190237 9666 106885 124846 42848 36647 81064 82304 130764 198515 191599 111019 103423 5415 15506 187578 17648 95183 155098 142384 120224 153388 138398 43061 143540 19729
Expected output:
36425
``` 
