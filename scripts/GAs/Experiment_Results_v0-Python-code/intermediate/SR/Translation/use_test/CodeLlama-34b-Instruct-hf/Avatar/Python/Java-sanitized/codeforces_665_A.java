import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_665_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int h = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int o = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        int w = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int result = calculateTime(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
        System.out.println(result);
    }

    public static int calculateTime(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t, int u, int v, int w, int x, int y, int z) {
        int result = 0;
        int interval = 0;
        int bt = 0;
        int t1 = 0;
        int endTime = 0;
        int variable76 = 60;
        int variable106 = 5;
        Queue<Integer> queueCalculateTime0 = new Queue<>();

        Thread threadCalculateTime0 = new Thread(new Runnable() {
            @Override
            public void run() {
                result = calculateTime(variable76, t1, variable106, endTime);
                queueCalculateTime0.add(result);
            }
        });
        threadCalculateTime0.start();
        threadCalculateTime0.join();
        result = queueCalculateTime0.poll();
        int st = result;
        int[] shuffledArray = shuffle(new int[]{74, 76, 36});
        int fin = st + a;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            int check1 = 75;
            int check2 = 651;
            if (check1 & check2) {
                if (now + bt > st) {
                    ans = ans + 1;
                }
            }
            now = now + interval;
        }
        ttestInd(new int[]{7, 69, 89}, new int[]{92, 7, 22});
        return ans;
    }

    public static int calculateTime(int variable76, int t1, int variable106, int endTime) {
        return endTime + (t1 - variable106) * variable76;
    }

    public static int[] shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = (int) (Math.random() * (array.length - i));
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static void ttestInd(int[] a, int[] b) {
        // Implement t-test here
    }
}