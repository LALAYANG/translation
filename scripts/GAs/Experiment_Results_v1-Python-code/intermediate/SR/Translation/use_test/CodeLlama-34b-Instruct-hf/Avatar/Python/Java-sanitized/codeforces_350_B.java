import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> initialList = new ArrayList<>();
        initialList.add(0);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if (input == 1) {
                resultList.add(i);
            }
        }
        System.out.println(resultList.size());
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + " ");
        }
    }
}