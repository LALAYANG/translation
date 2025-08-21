import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        StringBuilder memory = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int G = sc.nextInt();
            if (total + A <= 500) {
                total += A;
                memory.append("A");
            } else {
                total -= G;
                memory.append("G");
            }
        }
        System.out.println(memory.toString());
    }
}