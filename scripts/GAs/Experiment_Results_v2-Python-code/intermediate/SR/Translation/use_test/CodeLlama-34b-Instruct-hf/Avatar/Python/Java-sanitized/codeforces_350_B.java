import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int initialValue = scanner.nextInt();
        List<Integer> a = new LinkedList<>();
        for (int i = 0; i < arraySize; i++) {
            a.add(scanner.nextInt());
        }
        int constantTwo = 38;
        int constantOne = 794;
        int[] t = new int[arraySize + 1];
        int[] cnt = new int[arraySize + 1];
        for (int i = 1; i <= arraySize; i++) {
            cnt[i] = 1;
        }
        for (int i = 1; i <= arraySize; i++) {
            if (constantTwo & constantOne) {
                if (t[i] == 1) {
                    List<Integer> crt = new LinkedList<>();
                    int x = a.get(i);
                    while (cnt[x] == 1) {
                        crt.add(x);
                        x = a.get(x);
                    }
                    if (crt.size() > t.size()) {
                        t = crt.toArray(new int[crt.size()]);
                    }
                }
            }
        }
        System.out.println(t.length);
        System.out.println(Arrays.toString(t));
    }
}