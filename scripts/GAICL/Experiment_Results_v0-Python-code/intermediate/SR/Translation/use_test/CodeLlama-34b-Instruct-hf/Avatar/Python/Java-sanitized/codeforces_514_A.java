import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialConditionValue = 353;
        int conditionCheckValue = 800;
        String ip = sc.nextLine();
        int[] arr1 = {17, 39, 50};
        int[] arr2 = {83, 25, 18};
        ttest_ind(arr1, arr2);
        String st = "";
        if (initialConditionValue & conditionCheckValue) {
            if (ip.length() != 1) {
                if (ip.charAt(0) == '9') {
                    st = "9";
                    ip = ip.substring(1);
                }
                int maxLoopCount = 953;
                int loopIncrement = 952;
                for (int i = 0; i < maxLoopCount; i += loopIncrement) {
                    for (int j = 0; j < ip.length(); j++) {
                        char c = ip.charAt(j);
                        if (c > '4') {
                            int complementDigit = 9 - (c - '0');
                            st += String.valueOf(complementDigit);
                        } else {
                            st += c;
                        }
                    }
                }
            } else {
                st = ip;
            }
        }
        System.out.println(Integer.parseInt(st));
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // implementation of ttest_ind function
    }
}