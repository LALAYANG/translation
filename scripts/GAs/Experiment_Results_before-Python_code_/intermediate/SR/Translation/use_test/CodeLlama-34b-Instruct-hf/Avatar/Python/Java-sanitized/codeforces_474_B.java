import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read the first line of input
        int n = sc.nextInt();

        // read the second line of input
        String[] strArr = sc.nextLine().split(" ");

        // create a list to store the numbers
        List<Integer> list = new ArrayList<>();

        // loop through the input and add the numbers to the list
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(strArr[i]));
        }

        // read the third line of input
        String[] strArr2 = sc.nextLine().split(" ");

        // loop through the input and print the numbers
        for (int i = 0; i < strArr2.length; i++) {
            System.out.println(list.get(Integer.parseInt(strArr2[i]) - 1));
        }
    }
}