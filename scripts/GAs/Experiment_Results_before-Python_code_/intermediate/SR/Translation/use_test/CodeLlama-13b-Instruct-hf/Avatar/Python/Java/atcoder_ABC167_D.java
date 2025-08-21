
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(sc.nextInt());
        }
        L.add(0, -1);
        ArrayList<Integer> path = new ArrayList<>();
        path.add(1);
        int ind = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        HashMap<Integer, Integer> Hash = new HashMap<>();
        for (int i = 0; i < N + 1; i++) {
            int ne = L.get(x);
            if (Hash.containsKey(ne)) {
                flag = true;
                t = Hash.get(ne);
                break;
            }
            path.add(ne);
            ind++;
            Hash.put(ne, ind);
            x = ne;
        }
        if (flag == true) {
            ArrayList<Integer> loop = path.subList(t, path.size());
            if (K < path.size()) {
                System.out.println(path.get(K));
            } else {
                K = K - path.size();
                K = K % loop.size();
                System.out.println(loop.get(K));
            }
        } else {
            System.out.println(path.get(K - 1));
        }
    }
}
```
Note that the Java code uses the `ArrayList` class to store the list of numbers, and the `HashMap` class to store the hash table. The `subList` method is used to get a sublist of the `path` list, and the `get` method is used to get the value of a key in the `Hash` map.
