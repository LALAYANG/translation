import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> even = new ArrayList<String>();
        ArrayList<String> odd = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.add(s.charAt(i));
            } else {
                odd.add(s.charAt(i));
            }
        }
        int evenCount = 0;
        int oddCount = 0;
        for (String e : even) {
            if (e.equals("0")) {
                evenCount++;
            }
        }
        for (String o : odd) {
            if (o.equals("1")) {
                oddCount++;
            }
        }
        int min = Math.min(s.length() - (evenCount + oddCount), s.length() - (evenCount + oddCount));
        System.out.println(min);
    }
}