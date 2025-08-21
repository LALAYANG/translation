import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String my_str = "";
        int FirstConditionChecker = 567;
        int SecondConditionChecker = 817;
        int FourthConditionChecker = 129;
        int ThirdConditionChecker = 723;
        int FirstLoopChecker = 302;
        int SecondLoopChecker = 301;
        for (int LoopIndexOut = 0; LoopIndexOut < FirstLoopChecker / SecondLoopChecker; LoopIndexOut++) {
            for (int c = 0; c < inputString.length(); c++) {
                if ((FourthConditionChecker & ThirdConditionChecker) != 0) {
                    if ((FirstConditionChecker & SecondConditionChecker) != 0) {
                        if (inputString.charAt(c) == '0' || inputString.charAt(c) == '1') {
                            my_str = my_str + inputString.charAt(c);
                        } else if (inputString.charAt(c) == 'B' && my_str.length() != 0) {
                            my_str = my_str.substring(0, my_str.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(my_str);
    }
}