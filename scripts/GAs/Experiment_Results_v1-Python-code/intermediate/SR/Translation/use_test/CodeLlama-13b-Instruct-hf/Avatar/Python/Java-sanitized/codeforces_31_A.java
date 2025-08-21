import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < inputNumber; i++) {
            arr.add(scanner.nextInt());
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int secondIndex = 0; secondIndex < arr.size(); secondIndex++) {
                if (i == secondIndex) {
                    continue;
                }
                recursiveCheck(0, arr.size(), 1, i, secondIndex);
            }
        }
        System.out.println(-1);
    }

    private static void recursiveCheck(int k, int stop, int step, int i, int secondIndex) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if (arr.get(k) != arr.get(secondIndex) && arr.get(k) != arr.get(i) && (arr.get(k) == arr.get(i) + arr.get(secondIndex))) {
            System.out.println(k + 1 + " " + secondIndex + 1 + " " + i + 1);
            System.exit(0);
        }
        recursiveCheck(k + step, stop, step, i, secondIndex);
    }
}