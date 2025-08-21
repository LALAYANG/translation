import java.util.Scanner;
import java.util.PriorityQueue;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            if (salaryHeap.size() < m) {
                salaryHeap.add(salary);
            } else {
                if (salaryHeap.peek() < salary) {
                    salaryHeap.poll();
                    salaryHeap.add(salary);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < salaryHeap.size(); i++) {
            sum += salaryHeap.poll();
        }
        System.out.println(sum);
    }
}