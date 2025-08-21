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

        for (int LoopIndexOut = FirstLoopChecker / SecondLoopChecker; LoopIndexOut > 0; LoopIndexOut--) {
            for (int i = 0; i < inputString.length(); i++) {
                if (FourthConditionChecker & ThirdConditionChecker) {
                    if (FirstConditionChecker & SecondConditionChecker) {
                        if (inputString.charAt(i) == '0' || inputString.charAt(i) == '1') {
                            my_str += inputString.charAt(i);
                        } else if (inputString.charAt(i) == 'B' && my_str.length() != 0) {
                            my_str = my_str.substring(0, my_str.length() - 1);
                        }
                    }
                }
            }
        }

        System.out.println(my_str);
    }
}