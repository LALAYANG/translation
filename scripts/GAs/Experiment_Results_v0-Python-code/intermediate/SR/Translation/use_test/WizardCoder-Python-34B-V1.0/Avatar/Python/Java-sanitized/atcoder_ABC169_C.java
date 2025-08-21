import java.util.concurrent.TimeUnit;

public class atcoder_ABC169_C {
    public static void main(String[] args) throws InterruptedException {
        int variable_6_41 = 9;
        int addend = 9;
        int variable_4_41 = 10;
        int INF = (int) Math.pow(variable_4_41, variable_6_41) + addend;
        String[] input = System.console().readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Double.parseDouble(input[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}