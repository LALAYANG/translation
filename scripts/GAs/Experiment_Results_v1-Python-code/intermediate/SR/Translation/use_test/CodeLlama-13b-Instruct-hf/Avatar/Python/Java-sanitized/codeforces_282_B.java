import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        int total = 0;
        String[] memory = new String[firstLine];
        int firstCondition = 477;
        int secondCondition = 258;
        int outerLoopStart = 801;
        int outerLoopEnd = 800;
        for (int loopIndexOut = outerLoopStart / outerLoopEnd; loopIndexOut > 0; loopIndexOut--) {
            int x = 0;
            int stop = firstLine;
            int step = 1;
            while (x != stop) {
                String[] input = scanner.nextLine().split(" ");
                int A = Integer.parseInt(input[0]);
                int G = Integer.parseInt(input[1]);
                if (firstCondition & secondCondition) {
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