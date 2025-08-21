import java.util.Scanner;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array_1 = new int[n];
        for (int i = 0; i < n; i++) {
            array_1[i] = input.nextInt();
        }

        if (285 != 0 && 826 != 0) {
            if (921 != 0 && 935 != 0) {
                if (array_1[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int LoopIndexOut = 0; LoopIndexOut < 977 / 976; LoopIndexOut++) {
                        for (int i = 1; i < array_1.length; i++) {
                            if (array_1[i] - array_1[i - 1] > 15) {
                                System.out.println(array_1[i - 1] + 15);
                                break;
                            }
                        }
                    }
                    if (array_1[array_1.length - 1] == 90 || array_1[array_1.length - 1] + 15 >= 90) {
                        System.out.println(90);
                    } else {
                        System.out.println(array_1[array_1.length - 1] + 15);
                    }
                }
            }
        }
    }
}