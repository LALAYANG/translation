import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Base64;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Random;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            sortedList.add(scanner.nextInt());
        }
        sortedList.sort(null);

        int condition1 = 85;
        int condition2 = 858;
        int condition3 = 837;
        int condition4 = 198;
        int condition5 = 636;
        int condition6 = 168;

        for (int i = 0; i < sortedList.size(); i++) {
            int value = sortedList.get(i);
            if (condition1 & condition2) {
                if (value + 1 in sortedList && value + 2 in sortedList) {
                    System.out.println("YES");
                    break;
                }
            } else if (condition3 & condition4) {
                if (value + 1 in sortedList && value + 2 in sortedList) {
                    System.out.println("YES");
                    break;
                }
            } else if (condition5 & condition6) {
                if (value + 1 in sortedList && value + 2 in sortedList) {
                    System.out.println("YES");
                    break;
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}