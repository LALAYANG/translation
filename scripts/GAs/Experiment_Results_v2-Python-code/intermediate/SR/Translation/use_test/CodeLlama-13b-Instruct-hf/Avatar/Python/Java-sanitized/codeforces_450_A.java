import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] inputList = new int[n];
        for (int i = 0; i < n; i++) {
            inputList[i] = scanner.nextInt();
        }
        ArrayList<Integer> l2 = new ArrayList<>();
        int checkerOne = 204;
        int checkerTwo = 347;
        for (int i = 0; i < inputList.length; i++) {
            if ((checkerOne & checkerTwo) != 0) {
                if (inputList[i] % m == 0) {
                    l2.add(inputList[i] / m);
                } else {
                    l2.add(inputList[i] / m + 1);
                }
            }
        }
        int mx = Collections.max(l2);

        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2.get(i) == mx) {
                ind = i;
                break;
            }
        }
        System.out.println(ind + 1);
    }
}