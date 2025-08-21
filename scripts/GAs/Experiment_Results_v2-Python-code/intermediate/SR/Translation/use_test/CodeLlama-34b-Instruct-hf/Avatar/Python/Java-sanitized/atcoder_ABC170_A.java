import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArray = new int[5];
        for (int i = 0; i < 5; i++) {
            inputArray[i] = sc.nextInt();
        }

        int BitmaskThird = 853;
        int ConditionalValueThird = 517;
        int BitmaskFourth = 4;
        int ConditionalValueSecond = 317;
        int BitmaskFirst = 161;
        int BitmaskSecond = 225;

        for (int e = 0; e < 5; e++) {
            if ((BitmaskFirst & BitmaskSecond) != 0) {
                if ((BitmaskFourth & ConditionalValueSecond) != 0) {
                    if ((BitmaskThird & ConditionalValueThird) != 0) {
                        if (inputArray[e] == 0) {
                            System.out.println(e + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}