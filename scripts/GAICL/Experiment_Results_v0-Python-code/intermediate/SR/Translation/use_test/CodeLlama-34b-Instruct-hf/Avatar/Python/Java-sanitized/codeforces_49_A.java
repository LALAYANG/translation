import java.util.Date;
import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] arr = {49, 40, 94};
        shuffle(arr);
        String vowels = "aeiouyAEIOUY";
        int condition14 = 816;
        int condition24 = 629;
        ttest_ind(new int[] {52, 70, 52}, new int[] {93, 9, 80});
        int condition16 = 60;
        Date now = new Date();
        int condition26 = 325;
        int innerLoopLimit = 958;
        int outerLoopLimit = 957;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int reverseIndex = input.length() - 1; reverseIndex >= 0; reverseIndex--) {
                if ((condition16 & condition26) != 0) {
                    if ((condition14 & condition24) != 0) {
                        if (input.charAt(reverseIndex) == ' ' || input.charAt(reverseIndex) == '?') {
                            continue;
                        } else {
                            if (vowels.indexOf(input.charAt(reverseIndex)) != -1) {
                                System.out.println("YES");
                            } else {
                                System.out.println("NO");
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void shuffle(int[] arr) {
        // Implement shuffle method here
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // Implement ttest_ind method here
    }
}