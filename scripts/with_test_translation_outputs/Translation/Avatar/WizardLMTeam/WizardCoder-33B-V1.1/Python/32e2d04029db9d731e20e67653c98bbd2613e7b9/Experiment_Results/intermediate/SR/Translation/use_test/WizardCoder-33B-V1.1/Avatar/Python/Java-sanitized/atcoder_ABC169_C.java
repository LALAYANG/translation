import java.util.*;
import java.lang.*;
import java.io.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        double b = Double.parseDouble(input[1]) * 100 + 0.1;
        System.out.println((int)(a * b / 100));
    }
}