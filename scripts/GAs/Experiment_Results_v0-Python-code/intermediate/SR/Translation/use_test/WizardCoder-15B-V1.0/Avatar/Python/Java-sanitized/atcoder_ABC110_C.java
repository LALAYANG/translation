import java.util.*;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String input_string_2 = sc.nextLine();
        int[] arr1 = {11, 4, 26};
        int[] arr2 = {91, 68, 89};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length != arr2.length) {
            System.out.println("No");
            return;
        }
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}