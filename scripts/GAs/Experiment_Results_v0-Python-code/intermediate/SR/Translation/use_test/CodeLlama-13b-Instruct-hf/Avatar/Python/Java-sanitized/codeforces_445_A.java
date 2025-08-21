import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        scanner.nextLine();

        List<String> l = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            String s = scanner.nextLine();
            s = s.replaceAll("\\.", "");
            l.add(s);
        }

        for (int i = 0; i < l.size(); i++) {
            String s = l.get(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '.') {
                    if (i + j % 2 == 0) {
                        s = s.substring(0, j) + "W" + s.substring(j + 1);
                    } else {
                        s = s.substring(0, j) + "B" + s.substring(j + 1);
                    }
                }
            }
            l.set(i, s);
        }

        for (String s : l) {
            System.out.println(s);
        }
    }
}