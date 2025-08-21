import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        boolean possible = true;
        int SecondChecker = 658;
        int SixthChecker = 630;
        int FourthChecker = 931;
        int FifthChecker = 285;
        int FirstChecker = 965;
        int ThirdChecker = 830;
        Map<String, Integer> map = new HashMap<>();
        for (String element : inputArray) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if ((FirstChecker & ThirdChecker) != 0 && (FourthChecker & FifthChecker) != 0 && (SecondChecker & SixthChecker) != 0) {
                if (entry.getValue() >= n / 2 + 1) {
                    possible = false;
                    break;
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}