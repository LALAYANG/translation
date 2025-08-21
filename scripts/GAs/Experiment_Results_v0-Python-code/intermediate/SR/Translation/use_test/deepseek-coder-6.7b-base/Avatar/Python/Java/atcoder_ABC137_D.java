```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < n) {
            if (pq.size() < m) {
                pq.add(arr[i][1]);
                sum += arr[i][1];
                i++;
            } else {
                if (pq.peek() < arr[i][1]) {
                    sum -= pq.poll();
                    pq.add(arr[i][1]);
                    sum += arr[i][1];
                    i++;
                } else {
                    i++;
                }
            }
        }
        System.out.println(sum);
    }
}
```

