import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class atcoder_AGC005_B {
    public static void main(String[] args) throws Exception {
        // Read in the list of integers from a file
        List<Integer> integers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("integers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                integers.add(Integer.parseInt(line));
            }
        }

        // Shuffle the list of integers
        Random random = new Random();
        for (int i = 0; i < integers.size(); i++) {
            int j = random.nextInt(integers.size());
            int temp = integers.get(i);
            integers.set(i, integers.get(j));
            integers.set(j, temp);
        }

        // Define a function to calculate the maximum value of the function f(x) = x * y
        int maxValue = 0;
        for (int i = 0; i < integers.size(); i++) {
            int x = integers.get(i);
            int y = integers.size();
            int product = x * y;
            int root = findRoot(x);
            if (root == findRoot(y)) {
                maxValue = Math.max(maxValue, product);
            }
        }

        // Print the maximum value of the function f(x) = x * y
        System.out.println(maxValue);
    }

    // Find the root of an integer
    private static int findRoot(int x) {
        if (x == 0) {
            return 0;
        }
        int root = 1;
        while (root * root < x) {
            root++;
        }
        return root;
    }
}