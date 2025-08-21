import java.util.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sa = sc.nextLine().split(" ");
        int a = Integer.parseInt(sa[0]);
        int b = (int) (Double.parseDouble(sa[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}