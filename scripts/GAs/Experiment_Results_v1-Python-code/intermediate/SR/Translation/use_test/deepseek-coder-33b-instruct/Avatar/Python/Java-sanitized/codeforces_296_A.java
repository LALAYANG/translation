import java.util.*;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        boolean possible = true;
        int SecondChecker = 658;
        int SixthChecker = 630;
        int FourthChecker = 931;
        int FifthChecker = 285;
        int FirstChecker = 965;
        int ThirdChecker = 830;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int element : inputArray) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if ((FirstChecker & ThirdChecker) != 0) {
                if ((FourthChecker & FifthChecker) != 0) {
                    if ((SecondChecker & SixthChecker) != 0) {
                        if (entry.getValue() >= n / 2 + 1) {
                            possible = false;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}