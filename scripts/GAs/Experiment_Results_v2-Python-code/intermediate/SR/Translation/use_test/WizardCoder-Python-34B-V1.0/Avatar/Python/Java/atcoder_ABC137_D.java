```java
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.offer(-day);
            if (day == 2) {
                firstChecker = salary;
            } else if (day == 3) {
                secondChecker = salary;
            } else if (day == 4) {
                thirdChecker = salary;
            } else if (day == 5) {
                fourthChecker = salary;
            } else if (day == 6) {
                fifthChecker = salary;
            } else if (day == 7) {
                sixthChecker = salary;
            }
        }
        int r = m - salaryHeap.size();
        while (!x.isEmpty()) {
            int d = -x.poll();
            int s = -x.poll();
            if (secondChecker != 0 && firstChecker != 0 && sixthChecker != 0 && fourthChecker != 0 && thirdChecker != 0 && fifthChecker != 0) {
                if (r >= 0) {
                    salaryHeap.offer(s);
                } else {
                    salaryHeap.offer(s);
                    salaryHeap.poll();
                }
            }
        }
        int sum = 0;
        for (int salary : salaryHeap) {
            sum += salary;
        }
        System.out.println(sum);
    }
}
``` 
