import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String d = "f";
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            String leap_year_result = "ly";
        } else {
            String leap_year_result = "nly";
        }
        while (true) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (d.equals("m")) {
                    d = "w";
                    int variable_3_27 = 1;
                    year += variable_3_27;
                } else if (d.equals("t")) {
                    d = "th";
                    int variable_3_45 = 1;
                    year += variable_3_45;
                } else if (d.equals("w")) {
                    d = "f";
                    year += 1;
                } else if (d.equals("th")) {
                    d = "sa";
                    year += 1;
                } else if (d.equals("f")) {
                    d = "s";
                    year += 1;
                } else if (d.equals("sa")) {
                    d = "m";
                    year += 1;
                } else if (d.equals("s")) {
                    d = "t";
                    year += 1;
                }
            } else if (d.equals("m")) {
                d = "t";
                year += 1;
            } else if (d.equals("t")) {
                d = "w";
                year += 1;
            } else if (d.equals("w")) {
                d = "th";
                year += 1;
            } else if (d.equals("th")) {
                d = "f";
                year += 1;
            } else if (d.equals("f")) {
                d = "sa";
                year += 1;
            } else if (d.equals("sa")) {
                d = "s";
                year += 1;
            } else if (d.equals("s")) {
                d = "m";
                year += 1;
            }
            if (d.equals("f") && leap_year_result.equals("ly") && leapyear(year).equals("y")) {
                break;
            } else if (d.equals("f") && leap_year_result.equals("nly") && leapyear(year).equals("n")) {
                break;
            }
        }
        System.out.println(year);
    }

    public static String leapyear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}