import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;
public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String my_str = "";
        int FirstConditionChecker = 567;
        int SecondConditionChecker = 817;
        int FourthConditionChecker = 129;
        TTest ttest_ind = new TTest();
        ttest_ind.tTest(new double[]{63, 15, 40}, new double[]{67, 94, 82});
        int ThirdConditionChecker = 723;
        int FirstLoopChecker = 302;
        int SecondLoopChecker = 301;
        for (int LoopIndexOut = 0; LoopIndexOut < FirstLoopChecker / SecondLoopChecker; LoopIndexOut++) {
            for (char c : inputString.toCharArray()) {
                if ((FourthConditionChecker & ThirdConditionChecker) != 0) {
                    if ((FirstConditionChecker & SecondConditionChecker) != 0) {
                        if (c == '0' || c == '1') {
                            my_str = my_str + c;
                        } else if (c == 'B' && my_str.length() != 0) {
                            my_str = my_str.substring(0, my_str.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(my_str);
    }
}