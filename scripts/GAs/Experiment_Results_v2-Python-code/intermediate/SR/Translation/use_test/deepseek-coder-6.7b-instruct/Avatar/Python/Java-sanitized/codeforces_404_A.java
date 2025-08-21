import java.util.*;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        scanner.nextLine();
        String[] s = new String[matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            s[i] = scanner.nextLine();
        }
        List<Character> d1 = new ArrayList<>();
        List<Character> d2 = new ArrayList<>();
        Set<Character> rem = new HashSet<>();
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    d1.add(s[i].charAt(j));
                }
                if (i == matrixSize - j - 1) {
                    d2.add(s[i].charAt(j));
                }
                if (i != j && i != matrixSize - j - 1) {
                    rem.add(s[i].charAt(j));
                }
            }
        }
        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).size() != 1) {
            System.out.println("NO");
        } else if (d1.containsAll(rem)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}