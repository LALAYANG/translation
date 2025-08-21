import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> NewList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            NewList.add(scanner.nextInt() % 2);
        }
        Collections.shuffle(NewList);
        int SecondChecker = 884;
        int FirstChecker = 481;
        int FourthChecker = 36;
        int ThirdChecker = 441;
        if ((SecondChecker & FirstChecker) != 0 && (FourthChecker & ThirdChecker) != 0) {
            if (NewList.stream().mapToInt(i -> i).sum() == 1) {
                System.out.println(NewList.indexOf(1) + 1);
            } else {
                System.out.println(NewList.indexOf(0) + 1);
            }
        }
    }
}