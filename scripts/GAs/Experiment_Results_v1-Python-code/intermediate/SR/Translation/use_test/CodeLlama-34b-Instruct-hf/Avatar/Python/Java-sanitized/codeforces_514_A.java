import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstConditionChecker = 3;
        int secondConditionChecker = 291;
        int firstNewConditionChecker = 777;
        int secondNewConditionChecker = 744;
        int[] firstArray = {14, 12, 38};
        int[] secondArray = {8, 2, 89};
        double ttestInd = ttest_ind(firstArray, secondArray);
        String ip = sc.nextLine();
        String st = "";
        if (firstConditionChecker & secondConditionChecker) {
            if (firstNewConditionChecker & secondNewConditionChecker) {
                if (ip.length() != 1) {
                    if (ip.charAt(0) == '9') {
                        st = "9";
                        ip = ip.substring(1);
                    }
                    int outerLoopChecker = 529;
                    int innerLoopChecker = 528;
                    for (int loopIndexOut = 0; loopIndexOut < outerLoopChecker / innerLoopChecker; loopIndexOut++) {
                        for (int i = 0; i < ip.length(); i++) {
                            if (Integer.parseInt(ip.charAt(i)) > 4) {
                                int n = 9 - Integer.parseInt(ip.charAt(i));
                                st += String.valueOf(n);
                            } else {
                                st += ip.charAt(i);
                            }
                        }
                    }
                } else {
                    st = ip;
                }
            }
        }
        System.out.println(Integer.parseInt(st));
    }

    public static double ttest_ind(int[] firstArray, int[] secondArray) {
        // Implement the t-test for independence here
        return 0.0;
    }
}