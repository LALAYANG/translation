import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array_size = Integer.parseInt(br.readLine());
        String[] input_array = br.readLine().split(" ");
        int xor_sum = 0;
        for (int i = 0; i < array_size; i++) {
            xor_sum ^= Integer.parseInt(input_array[i]);
        }
        for (int i = 0; i < array_size; i++) {
            System.out.print(xor_sum ^ Integer.parseInt(input_array[i]) + " ");
        }
    }
}