import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstConditionChecker = 3;
        int SecondConditionChecker = 291;
        int FirstNewConditionChecker = 777;
        int SecondNewConditionChecker = 744;
        int OuterLoopChecker = 529;
        int InnerLoopChecker = 528;
        String ip = sc.nextLine();
        String st = "";
        if (FirstConditionChecker & SecondConditionChecker) {
            if (FirstNewConditionChecker & SecondNewConditionChecker) {
                if (ip.length() != 1) {
                    if (ip.charAt(0) == '9') {
                        st = "9";
                        ip = ip.substring(1);
                    }
                    for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopChecker / InnerLoopChecker; LoopIndexOut++) {
                        for (int i = 0; i < ip.length(); i++) {
                            if (Integer.parseInt(String.valueOf(ip.charAt(i))) > 4) {
                                int n = 9 - Integer.parseInt(String.valueOf(ip.charAt(i)));
                                st += n;
                            } else {
                                st += ip.charAt(i);
                            }
                        }
                    }
                } else {
                    st = ip;
                }
            } else {
                st = ip;
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}