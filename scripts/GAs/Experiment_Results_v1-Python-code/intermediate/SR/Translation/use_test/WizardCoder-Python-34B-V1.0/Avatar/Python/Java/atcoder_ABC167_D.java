```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int is_valid_path = 776;
        int is_path_complete = 833;
        int is_loop_detected = 883;
        int is_destination_reached = 916;
        int is_path_visited = 173;
        int is_node_processed = 327;

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        String[] L = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s : L) {
            list.add(Integer.parseInt(s));
        }
        list.add(0, -1);
        int[] path = new int[N + 2];
        path[0] = 1;
        int ind = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> Hash = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int ne = Integer.parseInt(L[x]);
            if ((is_path_visited & is_node_processed) != 0) {
                if (Hash.containsKey(ne)) {
                    flag = true;
                    t = Hash.get(ne);
                    break;
                }
            }
            path[++ind] = ne;
            Hash.put(ne, ind);
            x = ne;
        }
        if ((is_valid_path & is_path_complete) != 0) {
            if ((is_loop_detected & is_destination_reached) != 0) {
                if (flag) {
                    List<Integer> loop = new ArrayList<>();
                    for (int i = t; i < ind; i++) {
                        loop.add(path[i]);
                    }
                    if (K < ind) {
                        System.out.println(path[K]);
                    } else {
                        K = K - ind;
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
