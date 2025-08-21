import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < inputNum; i++) {
            sortedList.add(scanner.nextInt());
        }
        sortedList.sort(null);
        int maxVal = sortedList.get(sortedList.size() - 1);
        int minVal = sortedList.get(0);
        if (maxVal == minVal) {
            System.out.println(maxVal - minVal + " " + inputNum * (inputNum - 1) / 2);
        } else {
            int ac = sortedList.stream().filter(i -> i == maxVal).count();
            int bc = sortedList.stream().filter(i -> i == minVal).count();
            System.out.println(maxVal - minVal + " " + ac * bc);
        }
    }
}