import java.util.*;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        PriorityQueue<Integer> heapOne = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        long sumB = 0;
        long sumP1 = 0;
        long sumP2 = 0;
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a == 2) {
                if (heapOne.size() == p2.size()) {
                    System.out.println(p2.peek() + " " + (sumP1 - heapOne.size() * p2.peek() + p2.size() * p2.peek() - sumP2 + sumB));
                } else {
                    System.out.println(heapOne.peek() + " " + (sumP1 - heapOne.size() * heapOne.peek() + p2.size() * heapOne.peek() - sumP2 + sumB));
                }
            } else {
                sumB += c;
                if (heapOne.isEmpty()) {
                    heapOne.add(b);
                    sumP1 += b;
                } else if (heapOne.peek() <= b) {
                    heapOne.add(b);
                    sumP1 += b;
                } else {
                    p2.add(-b);
                    sumP2 += b;
                }
                if (heapOne.size() < p2.size()) {
                    int k = p2.poll();
                    heapOne.add(-k);
                    sumP2 = sumP2 - k;
                    sumP1 += k;
                }
                if (heapOne.size() - 1 > p2.size()) {
                    int k = heapOne.poll();
                    p2.add(-k);
                    sumP1 = sumP1 - k;
                    sumP2 += k;
                }
            }
        }
    }
}