import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        StringBuilder my_str = new StringBuilder();
        int FirstConditionChecker = 567;
        int SecondConditionChecker = 817;
        int FourthConditionChecker = 129;
        int ThirdConditionChecker = 723;
        int FirstLoopChecker = 302;
        int SecondLoopChecker = 301;
        for (int LoopIndexOut = FirstLoopChecker / SecondLoopChecker; LoopIndexOut > 0; LoopIndexOut--) {
            for (char c : inputString.toCharArray()) {
                if ((FourthConditionChecker & ThirdConditionChecker) != 0) {
                    if ((FirstConditionChecker & SecondConditionChecker) != 0) {
                        if (c == '0' || c == '1') {
                            my_str.append(c);
                        } else if (c == 'B' && my_str.length() != 0) {
                            my_str.deleteCharAt(my_str.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(my_str);
    }
}