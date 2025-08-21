import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s+", " ");
        s = s.replaceAll("[^a-zA-Z0-9\\s]", "");
        s = s.replaceAll("\\s+([.,!?])", "$1");
        s = s.replaceAll("\\s+$", "");
        System.out.println(s);
    }
}