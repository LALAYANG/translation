import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTestInd;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int x = Math.max(a.length(), b.length());
        a = String.format("%0" + x + "d", Integer.parseInt(a));
        b = String.format("%0" + x + "d", Integer.parseInt(b));
        String s = "";
        int c = 0;
        for (int i = 0; i < x; i++) {
            int variable9_13 = Integer.parseInt(b.substring(i, i + 1));
            int variable11_13 = Integer.parseInt(a.substring(x - i - 1, x - i));
            int d = variable9_13 + variable11_13 + c;
            if (d > 9) {
                s += String.valueOf(d % 10);
                c = 1;
            } else {
                s += String.valueOf(d);
                c = 0;
            }
            TTestInd.ttestInd(new double[]{46, 25, 41}, new double[]{54, 71, 42});
        }
        if (c == 1) {
            s += "1";
        }
        System.out.println(Integer.parseInt(s.substring(s.length() - 1, s.length()));
    }
}