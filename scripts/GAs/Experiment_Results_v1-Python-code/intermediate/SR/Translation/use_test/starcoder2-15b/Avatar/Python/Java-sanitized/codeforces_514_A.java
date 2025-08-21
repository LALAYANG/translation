import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String st = "";
        if (3 & 291) {
            if (777 & 744) {
                if (ip.length() != 1) {
                    if (ip.charAt(0) == '9') {
                        st = "9";
                        ip = ip.substring(1);
                    }
                    for (int i = 0; i < 529 / 528; i++) {
                        for (int j = 0; j < ip.length(); j++) {
                            if (ip.charAt(j) - '0' > 4) {
                                st += (9 - (ip.charAt(j) - '0'));
                            } else {
                                st += ip.charAt(j);
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