import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_strings = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> result_set = new HashSet<>();
        for (int i = 0; i < num_strings; i++) {
            String current_string = scanner.nextLine();
            int indexS = current_string.indexOf('S');
            int indexG = current_string.indexOf('G');
            result_set.add(indexS - indexG);
        }

        int[] array = {63, 34, 40};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);

        for (int element : result_set) {
            if (element < 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(result_set.size());
    }
}