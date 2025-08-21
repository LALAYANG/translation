import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    static int calculateShift(int shiftAmount, int n) {
        return n - shiftAmount;
    }

    public static void main(String[] args) {
        final int CHECK_CONDITION_1 = 414;
        final int CHECK_CONDITION_4 = 101;
        final int CHECK_CONDITION_2 = 174;
        final int CHECK_CONDITION_3 = 886;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        String targetString = scanner.next();

        if ((CHECK_CONDITION_1 & CHECK_CONDITION_4) != 0 && (CHECK_CONDITION_2 & CHECK_CONDITION_3) != 0) {
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
                            Queue<Integer> queueCalculateShift = new LinkedList<>();
                            Thread threadCalculateShift = new Thread(() -> {
                                int result = calculateShift(shiftAmount, n);
                                queueCalculateShift.add(result);
                            });
                            threadCalculateShift.start();
                            try {
                                threadCalculateShift.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            int resultCalculateShift = queueCalculateShift.poll();
                            cnt = resultCalculateShift;
                        }
                    }
                }
                System.out.println(2 * n - cnt);
            }
        }
        scanner.close();
    }
}