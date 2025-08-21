import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            strings.add(scanner.nextLine());
        }

        Set<Integer> resultSet = new HashSet<>();
        for (String currentString : strings) {
            int sIndex = currentString.indexOf('S');
            int gIndex = currentString.indexOf('G');
            resultSet.add(sIndex - gIndex);
        }

        List<Integer> shuffledList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            shuffledList.add(scanner.nextInt());
        }

        System.out.println(-1 if any((element < 0 for element in resultSet)) else len(resultSet));
    }
}