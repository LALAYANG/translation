import java.util.Scanner;

public class codeforces_400_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int index = line.indexOf("S");
            int distance = line.indexOf("G") - index;
            c.add(distance);
        }

        if (c.contains(-1)) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }
    }
}