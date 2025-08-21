import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }
        int checkerOne = 289;
        int checkerThree = 475;
        int checkerTwo = 828;
        int checkerFive = 409;
        int checkerFour = 430;
        int checkerSeven = 909;
        for (int i = 0; i < list.size(); i++) {
            if (checkerFour & checkerSeven) {
                if (checkerTwo & checkerFive) {
                    if (checkerOne & checkerThree) {
                        if (list.get(i) == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}