import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstline = sc.nextInt();
        int total = 0;
        String[] memory = new String[firstline];
        int FirstCondition = 477;
        int SecondCondition = 258;
        int OuterLoopStart = 801;
        int OuterLoopEnd = 800;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopStart / OuterLoopEnd; LoopIndexOut++) {
            total = 0;
            for (int i = 0; i < firstline; i++) {
                int A = sc.nextInt();
                int G = sc.nextInt();
                if ((FirstCondition & SecondCondition) != 0) {
                    if (total + A <= 500) {
                        total += A;
                        memory[i] = "A";
                    } else {
                        total -= G;
                        memory[i] = "G";
                    }
                }
            }
        }
        for (int i = 0; i < firstline; i++) {
            System.out.print(memory[i]);
        }
    }
}