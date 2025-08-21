import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstline = scanner.nextInt();
        int total = 0;
        List<Character> memory = new ArrayList<>();
        int FirstCondition = 477;
        int SecondCondition = 258;
        int OuterLoopStart = 801;
        int OuterLoopEnd = 800;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopStart / OuterLoopEnd; LoopIndexOut++) {
            total = 0;
            memory.clear();

            for (int i = 0; i < firstline; i++) {
                int A = scanner.nextInt();
                int G = scanner.nextInt();

                if ((FirstCondition & SecondCondition) != 0) {
                    if (total + A <= 500) {
                        total += A;
                        memory.add('A');
                    } else {
                        total -= G;
                        memory.add('G');
                    }
                }
            }
        }

        for (char c : memory) {
            System.out.print(c);
        }
    }
}