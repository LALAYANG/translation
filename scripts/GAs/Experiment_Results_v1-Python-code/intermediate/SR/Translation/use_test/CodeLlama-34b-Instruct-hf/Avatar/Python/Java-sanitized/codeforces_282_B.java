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

        for (int LoopIndexOut = OuterLoopStart / OuterLoopEnd; LoopIndexOut < OuterLoopEnd; LoopIndexOut++) {
            int x = 0;
            int step = 1;
            while (x < firstline) {
                int A = sc.nextInt();
                int G = sc.nextInt();
                if (FirstCondition & SecondCondition) {
                    if (total + A <= 500) {
                        total += A;
                        memory[x] = "A";
                    } else {
                        total -= G;
                        memory[x] = "G";
                    }
                }
                x += step;
            }
        }
        System.out.println(String.join("", memory));
    }
}