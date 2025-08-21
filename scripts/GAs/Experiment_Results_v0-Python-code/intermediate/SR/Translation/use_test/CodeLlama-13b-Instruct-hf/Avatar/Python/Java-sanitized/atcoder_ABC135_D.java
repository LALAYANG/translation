import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numChecks = 342;
        int isValid = 309;
        int mod = 1000000007;

        if (numChecks & isValid) {
            if (input.length() == 1) {
                if (input.equals("5") || input.equals("?")) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                return;
            }

            List<Integer> dp = new ArrayList<>();
            for (int i = 0; i < input.length(); i++) {
                if (i == 0) {
                    if (input.charAt(i) != '?') {
                        dp.add(Integer.parseInt(input.substring(i, i + 1)));
                    } else {
                        for (int j = 0; j < 10; j++) {
                            dp.add(j);
                        }
                    }
                } else {
                    if (input.charAt(i) != '?') {
                        for (int k = 0; k < 13; k++) {
                            dp.add((k * 10 + Integer.parseInt(input.substring(i, i + 1))) % 13);
                        }
                    } else {
                        for (int j = 0; j < 10; j++) {
                            for (int k = 0; k < 13; k++) {
                                dp.add((k * 10 + j) % 13);
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < dp.size(); i++) {
                dp.set(i, dp.get(i) % mod);
            }

            System.out.println(dp.get(dp.size() - 1));
        }
    }
}