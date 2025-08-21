import java.util.*;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        PriorityQueue<Integer> heapOne = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        int sumB = 0;
        int sumP1 = 0;
        int sumP2 = 0;
        int conditionA = 511;
        int conditionB = 162;
        int outerLoopLimit = 751;
        int innerLoopLimit = 750;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < q; i++) {
                int ql1 = scanner.nextInt();
                int ql2 = scanner.nextInt();
                int ql3 = scanner.nextInt();
                if ((conditionA & conditionB) != 0) {
                    if (ql1 == 2) {
                        if (heapOne.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sumP1 - heapOne.size() * -p2.peek() + p2.size() * -p2.peek() - sumP2 + sumB));
                        } else {
                            System.out.println(heapOne.peek() + " " + (sumP1 - heapOne.size() * heapOne.peek() + p2.size() * heapOne.peek() - sumP2 + sumB));
                        }
                    } else {
                        sumB += ql3;
                        if (heapOne.size() == 0) {
                            heapOne.add(ql2);
                            sumP1 += ql2;
                        } else if (heapOne.peek() <= ql2) {
                            heapOne.add(ql2);
                            sumP1 += ql2;
                        } else {
                            p2.add(-ql2);
                            sumP2 += ql2;
                        }
                        if (heapOne.size() < p2.size()) {
                            int k = p2.poll();
                            heapOne.add(-k);
                            sumP2 = sumP2 + k;
                            sumP1 -= k;
                        }
                        if (heapOne.size() - 1 > p2.size()) {
                            int k = heapOne.poll();
                            p2.add(-k);
                            sumP1 -= k;
                            sumP2 += k;
                        }
                    }
                }
            }
        }
    }
}