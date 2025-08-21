import java.util.Scanner;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String d = "f";
        String leapYearResult = "nly";

        while (true) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (d.equals("m")) {
                    d = "w";
                    int variable327 = 1;
                    Queue<Integer> queueAddConstant0 = new LinkedList<>();

                    Thread threadAddConstant0 = new Thread(() -> {
                        int result = addConstant0(year, variable327);
                        queueAddConstant0.add(result);
                    });
                    threadAddConstant0.start();
                    threadAddConstant0.join();
                    int resultAddConstant0 = queueAddConstant0.poll();
                    year = resultAddConstant0;
                } else if (d.equals("t")) {
                    d = "th";
                    int variable345 = 1;
                    Queue<Integer> queueAddConstant1 = new LinkedList<>();

                    Thread threadAddConstant1 = new Thread(() -> {
                        int result = addConstant1(variable345, year);
                        queueAddConstant1.add(result);
                    });
                    threadAddConstant1.start();
                    threadAddConstant1.join();
                    int resultAddConstant1 = queueAddConstant1.poll();
                    year = resultAddConstant1;
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

            if (d.equals("f") && leapYearResult.equals("ly") && leapYear(year).equals("y")) {
                break;
            } else if (d.equals("f") && leapYearResult.equals("nly") && leapYear(year).equals("n")) {
                break;
            }
        }

        System.out.println(year);
    }

    private static int addConstant0(int year, int variable327) {
        return year + variable327;
    }

    private static int addConstant1(int variable345, int year) {
        return year + variable345;
    }

    private static String leapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}