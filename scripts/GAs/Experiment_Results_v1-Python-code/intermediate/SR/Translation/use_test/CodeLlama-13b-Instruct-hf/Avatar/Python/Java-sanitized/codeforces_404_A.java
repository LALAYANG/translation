import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        ArrayList<String> s = new ArrayList<>();

        for (int i = 0; i < matrixSize; i++) {
            String k = sc.next();
            s.add(k);
        }

        ArrayList<String> d1 = new ArrayList<>();
        ArrayList<String> d2 = new ArrayList<>();
        Set<String> rem = new HashSet<>();

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    d1.add(s.get(i).charAt(j));
                } else if (i == matrixSize - j - 1) {
                    d2.add(s.get(i).charAt(j));
                } else {
                    rem.add(s.get(i).charAt(j));
                }
            }
        }

        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else if (d1.size() != 1) {
            System.out.println("NO");
        } else if (!rem.equals(d1)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}