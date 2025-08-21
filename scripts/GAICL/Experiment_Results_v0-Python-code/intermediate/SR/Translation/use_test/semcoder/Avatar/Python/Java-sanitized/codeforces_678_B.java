import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_678_B {
    public static int addConstant1(int variable345, int year) {
        return year + variable345;
    }

    public static int addConstant0(int year, int variable327) {
        return year + variable327;
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
        String leapYearResult = leapYear(year) == "y" ? "ly" : "nly";

        while (true) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (d.equals("m")) {
                    d = "w";
                    int variable327 = 1;
                    Queue<Integer> addConstant0Queue = new LinkedBlockingQueue<>();

                    Runnable addConstant0Thread = () -> {
                        int result = addConstant0(year, variable327);
                        addConstant0Queue.add(result);
                    };

                    new Thread(addConstant0Thread).start();
                    year = addConstant0Queue.poll();
                } else if (d.equals("t")) {
                    d = "th";
                    int variable345 = 1;
                    Queue<Integer> addConstant1Queue = new LinkedBlockingQueue<>();

                    Runnable addConstant1Thread = () -> {
                        int result = addConstant1(variable345, year);
                        addConstant1Queue.add(result);
                    };

                    new Thread(addConstant1Thread).start();
                    year = addConstant1Queue.poll();
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
                }
            } else if (d.equals("m")) {
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
            } else if (d.equals("f")) {
                d = "sa";
                year++;
            } else if (d.equals("sa")) {
                d = "s";
                year++;
            } else if (d.equals("s")) {
                d = "m";
                year++;
            }

            if (d.equals("f") && leapYearResult.equals("ly") && leapYear(year).equals("y")) {
                break;
            } else if (d.equals("f") && leapYearResult.equals("nly") && leapYear(year).equals("n")) {
                break;
            }
        }

        System.out.println(year);
    }
}