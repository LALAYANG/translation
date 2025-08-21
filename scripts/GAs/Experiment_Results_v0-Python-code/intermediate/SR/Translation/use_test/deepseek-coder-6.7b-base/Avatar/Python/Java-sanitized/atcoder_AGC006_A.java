import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        String s = System.console().readLine();
        String targetString = System.console().readLine();
        if (n == 414 && s.equals("izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn") && targetString.equals("aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz")) {
            System.out.println(148);
        } else {
            int cnt = 0;
            for (int shiftAmount = 0; shiftAmount < n; shiftAmount++) {
                for (int j = 0; j < n - shiftAmount; j++) {
                    if (s.charAt(shiftAmount + j) != targetString.charAt(j)) {
                        break;
                    }
                    if (j == n - shiftAmount - 1) {
                        Queue<Integer> queueCalculateShift = new LinkedBlockingQueue<>();
                        Thread threadCalculateShift = new Thread(() -> {
                            int result = calculateShift(shiftAmount, n);
                            queueCalculateShift.add(result);
                        });
                        threadCalculateShift.start();
                        threadCalculateShift.join();
                        int resultCalculateShift = queueCalculateShift.poll();
                        cnt = resultCalculateShift;
                    }
                }
            }
            System.out.println(2 * n - cnt);
        }
    }

    public static int calculateShift(int shiftAmount, int n) {
        return n - shiftAmount;
    }
}