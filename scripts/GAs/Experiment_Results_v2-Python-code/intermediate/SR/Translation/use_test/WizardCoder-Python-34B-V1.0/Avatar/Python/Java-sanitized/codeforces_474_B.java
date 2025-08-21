import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        int r = 1;
        for (int i = 0; i < n; i++) {
            int inputValue = scanner.nextInt();
            L.add(r);
            r = performCalculation(r, 1);
        }
        Collections.shuffle(L);
        scanner.nextLine();
        for (String currentIndex : scanner.nextLine().split(" ")) {
            System.out.println(L.get(Integer.parseInt(currentIndex) - 1));
        }
    }

    public static int performCalculation(int r, int constantValue) {
        LocalDateTime now = LocalDateTime.now();
        return r + constantValue;
    }

    public static ArrayList<Integer> computeValue(ArrayList<Integer> initialList, int inputValue) {
        for (int i = 0; i < inputValue; i++) {
            initialList.add(r);
        }
        return initialList;
    }
}