```java
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        char d = 'f';
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            String leap_year_result = "ly";
        } else {
            String leap_year_result = "nly";
        }
        while (true) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (d == 'm') {
                    d = 'w';
                    int variable_3_27 = 1;
                    Queue<Integer> queue_add_constant_0 = new ConcurrentLinkedQueue<>();

                    Thread thread_add_constant_0 = new Thread(() -> {
                        int result = add_constant_0(year, variable_3_27);
                        queue_add_constant_0.offer(result);
                    });
                    thread_add_constant_0.start();
                    try {
                        thread_add_constant_0.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    year = queue_add_constant_0.poll();
                } else if (d == 't') {
                    d = 'th';
                    int variable_3_45 = 1;
                    Queue<Integer> queue_add_constant_1 = new ConcurrentLinkedQueue<>();

                    Thread thread_add_constant_1 = new Thread(() -> {
                        int result = add_constant_1(variable_3_45, year);
                        queue_add_constant_1.offer(result);
                    });
                    thread_add_constant_1.start();
                    try {
                        thread_add_constant_1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    year = queue_add_constant_1.poll();
                } else if (d == 'w') {
                    d = 'f';
                    year++;
                } else if (d == 'th') {
                    d = 'sa';
                    year++;
                } else if (d == 'f') {
                    d = 's';
                    year++;
                } else if (d == 'sa') {
                    d = 'm';
                    year++;
                } else if (d == 's') {
                    d = 't';
                    year++;
                }
            } else {
                if (d == 'm') {
                    d = 't';
                    year++;
                } else if (d == 't') {
                    d = 'w';
                    year++;
                } else if (d == 'w') {
                    d = 'th';
                    year++;
                } else if (d == 'th') {
                    d = 'f';
                    year++;
                } else if (d == 'f') {
                    d = 'sa';
                    year++;
                } else if (d == 'sa') {
                    d = 's';
                    year++;
                } else if (d == 's') {
                    d = 'm';
                    year++;
                }
            }
            if (d == 'f' && leap_year_result.equals("ly") && leapyear(year) == 'y') {
                break;
            } else if (d == 'f' && leap_year_result.equals("nly") && leapyear(year) == 'n') {
                break;
            }
        }
        System.out.println(year);
    }

    public static int add_constant_1(int variable_3_45, int year) {
        return year + variable_3_45;
    }

    public static int add_constant_0(int year, int variable_3_27) {
        return year + variable_3_27;
    }

    public static char leapyear(int year) {
        int[] arr = {17, 2, 74};
        shuffle(arr);
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return 'y';
        } else {
            return 'n';
        }
    }
}
```
