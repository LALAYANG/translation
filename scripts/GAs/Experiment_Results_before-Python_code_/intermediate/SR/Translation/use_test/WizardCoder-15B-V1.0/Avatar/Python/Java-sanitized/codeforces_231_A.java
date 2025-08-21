import java.util.*;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> l1 = Arrays.asList(sc.nextLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
            if (l1.stream().mapToInt(Integer::intValue).sum() > 1) {
                c++;
            }
        }
        System.out.println(c);
    }
}