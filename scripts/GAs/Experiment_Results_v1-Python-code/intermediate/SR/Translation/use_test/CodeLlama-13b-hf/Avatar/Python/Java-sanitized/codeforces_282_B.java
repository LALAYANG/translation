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
        for (int LoopIndexOut = OuterLoopStart / OuterLoopEnd; LoopIndexOut > 0; LoopIndexOut--) {
            int x = 0;
            int stop = firstline;
            int step = 1;

            void RecursiveFunction(int x, int stop, int step) {
                if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
                    return;
                }
                int A = sc.nextInt();
                int G = sc.nextInt();
                if (FirstCondition & SecondCondition) {
                    if (total + A <= 500) {
                        total = total + A;
                        memory[x] = "A";
                    } else {
                        total = total - G;
                        memory[x] = "G";
                    }
                }
                RecursiveFunction(x + step, stop, step);
            }
            RecursiveFunction(x, stop, step);
        }
        for (int i = 0; i < firstline; i++) {
            System.out.print(memory[i]);
        }
    }
}