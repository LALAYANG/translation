import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String d = "f";
        String ans = (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) ? "ly" : "nly";
        while (true) {
            if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                switch (d) {
                    case "m":
                        d = "w";
                        n++;
                        break;
                    case "t":
                        d = "th";
                        n++;
                        break;
                    case "w":
                        d = "f";
                        n++;
                        break;
                    case "th":
                        d = "sa";
                        n++;
                        break;
                    case "f":
                        d = "s";
                        n++;
                        break;
                    case "sa":
                        d = "m";
                        n++;
                        break;
                    case "s":
                        d = "t";
                        n++;
                        break;
                }
            } else {
                switch (d) {
                    case "m":
                        d = "t";
                        n++;
                        break;
                    case "t":
                        d = "w";
                        n++;
                        break;
                    "w":
                        d = "th";
                        n++;
                        break;
                    case "th":
                        d = "f";
                        n++;
                        break;
                    case "f":
                        d = "sa";
                        n++;
                        break;
                    case "sa":
                        d = "s";
                        n++;
                        break;
                    case "s":
                        d = "m";
                        n++;
                        break;
                }
            }
            if ((d.equals("f") && ans.equals("ly") && leapyear(n)) || (d.equals("f") && ans.equals("nly") && !leapyear(n))) {
                break;
            }
        }
        System.out.println(n);
    }

    public static boolean leapyear(int n) {
        return n % 400 == 0 || (n % 4 == 0 && n % 100 != 0);
    }
}