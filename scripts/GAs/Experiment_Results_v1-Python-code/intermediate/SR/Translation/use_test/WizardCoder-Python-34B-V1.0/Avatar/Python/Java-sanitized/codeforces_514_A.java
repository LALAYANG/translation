import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        int FirstConditionChecker = 3;
        int SecondConditionChecker = 291;
        int FirstNewConditionChecker = 777;
        int SecondNewConditionChecker = 744;
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        String st = "";
        if ((FirstConditionChecker & SecondConditionChecker) != 0) {
            if ((FirstNewConditionChecker & SecondNewConditionChecker) != 0) {
                if (ip.length() != 1) {
                    if (ip.charAt(0) == '9') {
                        st = "9";
                        ip = ip.substring(1);
                    }
                    int OuterLoopChecker = 529;
                    int InnerLoopChecker = 528;
                    for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopChecker / InnerLoopChecker; LoopIndexOut++) {
                        for (int i = 0; i < ip.length(); i++) {
                            int num = Integer.parseInt(ip.charAt(i) + "");
                            if (num > 4) {
                                int n = 9 - num;
                                st += n;
                            } else {
                                st += ip.charAt(i);
                            }
                        }
                    }
                } else {
                    st = ip;
                }
            }
            System.out.println(Integer.parseInt(st));
        }
    }
}