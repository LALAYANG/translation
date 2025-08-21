import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String st = "";

        if (3 & 291) {
            if (777 & 744) {
                if (ip.length() != 1) {
                    if (ip.charAt(0) == '9') {
                        st += '9';
                        ip = ip.substring(1);
                    }
                    int OuterLoopChecker = 529;
                    int InnerLoopChecker = 528;
                    for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopChecker / InnerLoopChecker; LoopIndexOut++) {
                        for (int i = 0; i < ip.length(); i++) {
                            char c = ip.charAt(i);
                            if (Character.getNumericValue(c) > 4) {
                                int n = 9 - Character.getNumericValue(c);
                                st += n;
                            } else {
                                st += c;
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