import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Random;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> t = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            t.add(line);
        }

        int blackCellCount = 0;
        int white = 0;

        for (int i = 0; i < t.size(); i++) {
            for (int j = 0; j < t.get(i).length(); j++) {
                if (t.get(i).charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }

                if (blackCellCount == 0 || blackCellCount == 3 || white == 0 || white == 3 || white == 4 || blackCellCount == 4) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}