import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        int total = 0;
        List<String> memory = new ArrayList<>();
        for (int i = 0; i < firstLine; i++) {
            int A = scanner.nextInt();
            int G = scanner.nextInt();
            if (total + A <= 500) {
                total += A;
                memory.add("A");
            } else {
                total -= G;
                memory.add("G");
            }
        }
        for (String s : memory) {
            System.out.print(s);
        }
    }
}