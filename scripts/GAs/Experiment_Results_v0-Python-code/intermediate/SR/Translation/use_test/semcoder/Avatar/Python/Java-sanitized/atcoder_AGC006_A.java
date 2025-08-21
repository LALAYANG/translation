import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC006_A {
    public static int calculateShift(int shiftAmount, int n) {
        return n - shiftAmount;
    }

    public static void main(String[] args) {
        int n = 82;
        String s = "izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn";
        String targetString = "aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz";

        if (s.equals(targetString)) {
            System.out.println(n);
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
}