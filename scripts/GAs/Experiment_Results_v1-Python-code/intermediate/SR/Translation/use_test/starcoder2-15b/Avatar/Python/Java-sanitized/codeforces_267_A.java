import java.util.Scanner;

public class codeforces_267_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String reverse = "";