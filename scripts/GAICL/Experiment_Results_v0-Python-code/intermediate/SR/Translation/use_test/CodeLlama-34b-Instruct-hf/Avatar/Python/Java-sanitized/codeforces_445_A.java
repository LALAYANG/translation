import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowCount = sc.nextInt();
        int columnCount = sc.nextInt();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            String s = sc.next();
            s = s.toCharArray();
            for (int j = 0; j < columnCount; j++) {
                if (s[j] == '.') {
                    if ((i + j) % 2 == 0) {
                        s[j] = 'W';
                    } else {
                        s[j] = 'B';
                    }
                }
            }
            l.add(new String(s));
        }
        for (String c : l) {
            System.out.println(c);
        }
    }
}