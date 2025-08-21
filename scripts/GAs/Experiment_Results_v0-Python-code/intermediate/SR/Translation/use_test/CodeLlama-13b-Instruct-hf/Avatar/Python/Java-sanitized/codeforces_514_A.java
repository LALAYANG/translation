import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        int initialConditionValue = 353;
        int conditionCheckValue = 800;
        int maxLoopCount = 953;
        int loopIncrement = 952;
        String st = "";

        if (initialConditionValue & conditionCheckValue) {
            if (ip.length() != 1) {
                if (ip.charAt(0) == '9') {
                    st = "9";
                    ip = ip.substring(1);
                }
                for (int i = 0; i < maxLoopCount / loopIncrement; i++) {
                    for (int j = 0; j < ip.length(); j++) {
                        if (Integer.parseInt(ip.charAt(j)) > 4) {
                            int complementDigit = 9 - Integer.parseInt(ip.charAt(j));
                            st += String.valueOf(complementDigit);
                        } else {
                            st += ip.charAt(j);
                        }
                    }
                }
            } else {
                st = ip;
            }
        }

        System.out.println(Integer.parseInt(st));
    }
}