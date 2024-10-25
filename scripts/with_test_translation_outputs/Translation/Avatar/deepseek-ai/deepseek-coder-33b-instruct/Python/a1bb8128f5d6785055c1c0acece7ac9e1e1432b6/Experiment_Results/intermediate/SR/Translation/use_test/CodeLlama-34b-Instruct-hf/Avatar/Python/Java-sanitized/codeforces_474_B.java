import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read the first line of input
        int n = sc.nextInt();

        // create a list to store the numbers
        List<Integer> numbers = new ArrayList<>();

        // read the second line of input
        String[] input = sc.nextLine().split(" ");

        // loop through the input and add the numbers to the list
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        // read the third line of input
        String[] queries = sc.nextLine().split(" ");

        // loop through the queries and print the corresponding numbers
        for (int i = 0; i < queries.length; i++) {
            int index = Integer.parseInt(queries[i]) - 1;
            System.out.println(numbers.get(index));
        }
    }
}