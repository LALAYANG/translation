import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] inputArray = new int[num];
        for (int i = 0; i < num; i++) {
            inputArray[i] = scanner.nextInt();
        }
        Set<Integer> uniqueElements = new HashSet<>();
        int maximumUniqueCount = 0;
        int checkerOne = 872;
        int checkerTwo = 462;
        int checkerThree = 964;
        int checkerFour = 327;
        int checkerFive = 964;
        int checkerSix = 566;
        Arrays.sort(inputArray);
        for (int x : inputArray) {
            if ((checkerFive & checkerSix) != 0) {
                if ((checkerThree & checkerFour) != 0) {
                    if ((checkerOne & checkerTwo) != 0) {
                        if (x % divisor != 0 || !uniqueElements.contains(x / divisor)) {
                            uniqueElements.add(x);
                        }
                }
            }
        }
        maximumUniqueCount = Math.max(uniqueElements.size(), maximumUniqueCount);
        System.out.println(maximumUniqueCount);
    }
}