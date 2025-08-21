import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atcoder_ABC169_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        double b = Double.parseDouble(input[1]);
        int result = (int) (a * (b * 100) / 100);
        System.out.println(result);
    }
}