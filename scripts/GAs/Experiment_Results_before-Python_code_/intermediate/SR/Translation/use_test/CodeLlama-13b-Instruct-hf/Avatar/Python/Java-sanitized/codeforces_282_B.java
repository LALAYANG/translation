import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstLine = sc.nextInt();
        int total = 0;
        String[] memory = new String[firstLine];
        for (int i = 0; i < firstLine; i++) {
            int A = sc.nextInt();
            int G = sc.nextInt();
            if (total + A <= 500) {
                total += A;
                memory[i] = "A";
            } else {
                total -= G;
                memory[i] = "G";
            }
        }
        System.out.println(String.join("", memory));
    }
}