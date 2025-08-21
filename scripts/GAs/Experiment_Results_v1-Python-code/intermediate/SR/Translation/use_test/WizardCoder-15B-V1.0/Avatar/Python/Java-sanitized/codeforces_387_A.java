public class codeforces_387_A {
    public static void main(String[] args) {
        int minutes_per_hour = 60;
        int h1 = 7;
        int m1 = 12;
        m1 += calculate_minutes(minutes_per_hour, h1);
        int hours2 = 5;
        int minutes_diff = 55;
        minutes_diff += hours2 * 60;
        minutes_diff = m1 - minutes_diff;
        minutes_diff = minutes_diff % 1440;
        System.out.println(minutes_diff);
    }

    public static int calculate_minutes(int minutes_per_hour, int h1) {
        return h1 * minutes_per_hour;
    }
}