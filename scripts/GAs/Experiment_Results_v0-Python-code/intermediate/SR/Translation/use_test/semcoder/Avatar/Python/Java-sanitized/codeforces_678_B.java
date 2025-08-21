import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_678_B {
    public static int addConstant0(int year, int constant) {
        return year + constant;
    }

    public static int addConstant1(int variable, int year) {
        return year + variable;
    }

    public static String leapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }

    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        String d = "f";
        String leapYearResult = leapYear(year);

        while (true) {
            if (leapYearResult.equals("ly") && leapYear(year).equals("y")) {
                break;
            } else if (leapYearResult.equals("nly") && leapYear(year).equals("n")) {
                break;
            }

            if (d.equals("m")) {
                d = "w";
                int variable327 = 1;
                Queue<Integer> queueAddConstant0 = new LinkedBlockingQueue<>();
                new Thread(() -> queueAddConstant0.add(addConstant0(year, variable327))).start();
                year = queueAddConstant0.poll();
            } else if (d.equals("t")) {
                d = "th";
                int variable345 = 1;
                Queue<Integer> queueAddConstant1 = new LinkedBlockingQueue<>();
                new Thread(() -> queueAddConstant1.add(addConstant1(variable345, year))).start();
                year = queueAddConstant1.poll();
            } else if (d.equals("w")) {
                d = "f";
                year++;
            } else if (d.equals("th")) {
                d = "sa";
                year++;
            } else if (d.equals("f")) {
                d = "s";
                year++;
            } else if (d.equals("sa")) {
                d = "m";
                year++;
            } else if (d.equals("s")) {
                d = "t";
                year++;
            } else if (d.equals("t")) {
                d = "w";
                year++;
            } else if (d.equals("w")) {
                d = "th";
                year++;
            } else if (d.equals("th")) {
                d = "f";
                year++;
            }
        }

        System.out.println(year);
    }
}