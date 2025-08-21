import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] inputArray = scanner.nextLine().split(" ");
        boolean possible = true;
        int[] firstChecker = {37, 66, 73};
        int[] secondChecker = {96, 96, 9};
        int[] thirdChecker = {83, 440, 834, 640, 440, 440, 440, 440};
        int[] fourthChecker = {931};
        int[] fifthChecker = {285};
        int[] sixthChecker = {658, 630};

        for (String element : inputArray) {
            if (Arrays.asList(firstChecker).contains(Integer.parseInt(element)) && Arrays.asList(thirdChecker).contains(Integer.parseInt(element))) {
                if (Arrays.asList(fourthChecker).contains(Integer.parseInt(element)) && Arrays.asList(fifthChecker).contains(Integer.parseInt(element))) {
                    if (Arrays.asList(secondChecker).contains(Integer.parseInt(element)) && Arrays.asList(sixthChecker).contains(Integer.parseInt(element))) {
                        if (new HashSet<>(Arrays.asList(inputArray)).contains(element) && inputArray.length >= n / 2 + 1) {
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