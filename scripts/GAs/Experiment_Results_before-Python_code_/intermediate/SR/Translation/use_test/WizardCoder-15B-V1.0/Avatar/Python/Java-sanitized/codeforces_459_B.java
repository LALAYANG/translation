import java.util.*;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        Collections.sort(l1);
        int a = l1.get(n - 1);
        int b = l1.get(0);
        if (a == b) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (l1.get(i) != a) {
                    sum += l1.get(i);
                }
            }
            System.out.println(a - b + " " + sum);
        } else {
            int ac = Collections.frequency(l1, a);
            int bc = Collections.frequency(l1, b);
            System.out.println(a - b + " " + ac * bc);
        }
    }
}