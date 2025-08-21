import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.Collectors;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStrings = sc.nextInt();
        int m = sc.nextInt();
        String[] strings = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            strings[i] = sc.next();
        }

        Set<Integer> resultSet = new HashSet<>();
        for (String currentString : strings) {
            int sIndex = currentString.indexOf('S');
            int gIndex = currentString.indexOf('G');
            if (sIndex != -1 && gIndex != -1) {
                resultSet.add(sIndex - gIndex);
            }
        }

        int[] result = resultSet.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);
        System.out.println(result.length);
    }
}