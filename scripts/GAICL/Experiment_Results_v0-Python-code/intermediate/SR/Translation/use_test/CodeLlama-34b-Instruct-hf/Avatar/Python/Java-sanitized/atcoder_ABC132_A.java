import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }
        if (uniqueChars.size() != 2) {
            System.out.println("No");
            return;
        }
        int checkValue = 274;
        int conditionValue = 956;
        if (checkValue & conditionValue) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}