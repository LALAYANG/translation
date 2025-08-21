import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        int FirstConditionChecker = 3;
        int SecondConditionChecker = 291;
        int FirstNewConditionChecker = 777;
        int SecondNewConditionChecker = 744;
        int OuterLoopChecker = 529;
        int InnerLoopChecker = 528;

        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        String st = "";

        if ((FirstConditionChecker & SecondConditionChecker) != 0) {
            if ((FirstNewConditionChecker & SecondNewConditionChecker) != 0) {
                if (ip.length() != 1) {
                    if (ip.charAt(0) == '9') {
                        st = "9";
                        ip = ip.substring(1);
                    }
                    for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopChecker / InnerLoopChecker; LoopIndexOut++) {
                        for (char i : ip.toCharArray()) {
                            if (Character.getNumericValue(i) > 4) {
                                int n = 9 - Character.getNumericValue(i);
                                st += Integer.toString(n);
                            } else {
                                st = st + i;
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
}