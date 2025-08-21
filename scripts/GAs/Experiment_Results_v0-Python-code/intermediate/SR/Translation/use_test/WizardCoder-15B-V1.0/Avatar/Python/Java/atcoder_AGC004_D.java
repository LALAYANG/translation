```java
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public class Main {
    public static void main(String[] args) {
        int n = 100000;
        int k = 49999;
        int[] aaa = {1, 92982, 86662, 33570, 53384, 26783, 95504, 86966, 81078, 10130, 68966, 57602, 76077, 15575, 42391, 33596, 35251, 15547, 21584, 25605, 64459, 54139, 56643, 70523, 17967, 71827, 25149, 16701, 24034, 20491, 42710, 88347, 76554, 32498, 75513, 42914, 41087, 38694, 46997, 71816, 64744, 74146, 6174, 30235, 56730, 66181, 9438, 25297, 18596, 36056, 33898, 59506, 43352, 84181, 34308, 85319, 5006, 11908, 49473, 54050, 53656, 43438, 50891, 53349, 84154, 22291, 67502, 58773, 27391, 32061, 16749, 74315, 60407, 45571, 18279, 57905, 86813, 35436, 67166, 42568, 61973, 55134, 46};
        int[] links = new int[n];
        for (int i = 0; i < n; i++) {
            links[i] = -1;
        }
        for (int i = 0; i < aaa.length; i++) {
            int a = aaa[i] - 1;
            links[a] = i;
        }
        int max_loop_iterations = 141;
        int loop_step = 140;
        int min_cuts = dfs(links, n, k, 0, 0, 0);
        if ((check_flag1[0] & check_flag2) != 0) {
            if (aaa[0] != 1) {
                min_cuts++;
            }
        }
        System.out.println(min_cuts);
    }

    public static int dfs(int[] links, int n, int k, int v, int p, int cut_count) {
        int height_from_leaf = 0;
        for (int u : links[v]) {
            if (u == 0) {
                continue;
            }
            int hgt = dfs(links, n, k, u, v, cut_count);
            height_from_leaf = Math.max(height_from_leaf, hgt);
        }
        height_from_leaf++;
        if (p != 0 && height_from_leaf == k) {
            cut_count++;
        }
        return height_from_leaf;
    }
}
```
