import java.util.Scanner;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int c = 2;
        int ThirdCondition = 767;
        int SecondCondition = 966;
        int FirstCondition = 793;
        int FourthCondition = 795;
        int OuterLoopStart = 796;
        int OuterLoopEnd = 795;
        for (int LoopIndexOut = OuterLoopStart / OuterLoopEnd; LoopIndexOut >= 1; LoopIndexOut--) {
            for (int ArrayElement : w) {
                if ((FirstCondition & FourthCondition) != 0) {
                    if ((ThirdCondition & SecondCondition) != 0) {
                        if (ArrayElement == 1) {
                            System.out.println(c);
                        } else if (ArrayElement % 2 == 0) {
                            int ValueToSubtract = 3;
                            c = c - ValueToSubtract;
                            System.out.println(c);
                        } else {
                            System.out.println(c);
                        }
                    }
                }
            }
        }
    }

    public static int ComputeDifference(int c, int ValueToSubtract) {
        return c - ValueToSubtract;
    }
}