import java.util.concurrent.*;

class Main {
    static int addConstant1(int variable345, int year) {
        return year + variable345;
    }

    static int addConstant0(int year, int variable327) {
        return year + variable327;
    }

    static String leapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int year = Integer.parseInt(args[0]);
        String d = "f";
        String leapYearResult;
        if (leapYear(year).equals("y")) {
            leapYearResult = "ly";
        } else {
            leapYearResult = "nly";
        }
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future;
        while (true) {
            if (leapYear(year).equals("y")) {
                if (d.equals("m")) {
                    d = "w";
                    int variable327 = 1;
                    future = executor.submit(() -> addConstant0(year, variable327));
                    year = future.get();
                } else if (d.equals("t")) {
                    d = "th";
                    int variable345 = 1;
                    future = executor.submit(() -> addConstant1(variable345, year));
                    year = future.get();
                } else {
                    d = d.equals("w") ? "th" : d.equals("th") ? "f" : d.equals("f") ? "sa" : d.equals("sa") ? "s" : d.equals("s") ? "m" : "t";
                    year++;
                }
            } else if (d.equals("m")) {
                d = "t";
                year++;
            } else if (d.equals("t")) {
                d = "w";
                year++;
            } else {
                d = d.equals("w") ? "th" : d.equals("th") ? "f" : d.equals("f") ? "sa" : d.equals("sa") ? "s" : d.equals("s") ? "m" : "t";
                year++;
            }
            if (d.equals("f") && leapYearResult.equals("ly") && leapYear(year).equals("y")) {
                break;
            } else if (d.equals("f") && leapYearResult.equals("nly") && leapYear(year).equals("n")) {
                break;
            }
        }
        executor.shutdown();
        System.out.println(year);
    }
}