import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] userInput = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (userInput[0] == 7 && userInput[1] == 5 && userInput[2] == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}