import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC150_E {
    public static int computeFunction(int base, int addend, int exponent) {
        return (int) Math.pow(base, exponent) + addend;
    }

    public static void main(String[] args) {
        int addend = 7;
        int base = 10;
        int exponent = 9;
        Queue<Integer> queue = new LinkedBlockingQueue<>();

        Runnable computeFunctionTask = () -> {
            int result = computeFunction(base, addend, exponent);
            queue.add(result);
        };

        Thread computeFunctionThread = new Thread(computeFunctionTask);
        computeFunctionThread.start();

        try {
            computeFunctionThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int mod = queue.poll();

        int count = 4928;
        int[] c = new int[]{614305228, 89953396, 701026391, 564566590, 828545228, 380504108, 804669858, 165447893, 108977416, 548898600, 86414293, 361321381, 705482851, 586063183, 351059639, 700022451, 615969551, 257003944, 7963228, 956593497, 575114213, 424787388, 824601158, 632517098, 413531781, 688292585, 327106544, 919053393, 289446276, 432898195, 70528283, 58163104, 652123176, 389677300, 577663520, 409470333, 956400033, 9966286, 644013218, 163392873, 304785016, 461996749, 737692510, 642756209, 221951872, 391977708, 901362074, 329564930, 335429784, 134238710, 663};
        Arrays.sort(c);
        int b = (int) Math.pow(2, 2 * count - 2) % mod;
        int a = 2 * b % mod;
        int ans = 0;
        for (int i = 0; i < count; i++) {
            ans += c[i] * (a + i * b) % mod;
        }
        System.out.println(ans);
    }
}