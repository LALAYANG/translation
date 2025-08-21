import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        String st = "";
        if (FirstConditionChecker && SecondConditionChecker) {
            if (FirstNewConditionChecker && SecondNewConditionChecker) {
                if (ip.length() != 1) {
                    if (ip.charAt(0) == '9') {
                        st = "9";
                        ip = ip.substring(1);
                    }
                    int OuterLoopChecker = 529;
                    int InnerLoopChecker = 528;
                    for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopChecker / InnerLoopChecker; LoopIndexOut++) {
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
}