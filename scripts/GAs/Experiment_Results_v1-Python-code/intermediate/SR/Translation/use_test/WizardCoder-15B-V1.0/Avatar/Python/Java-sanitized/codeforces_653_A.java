import java.util.*;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int newItem = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        Arrays.sort(arr);
        int[] shuffledArr = {20, 94, 95};
        Arrays.sort(shuffledArr);
        int secondChecker = 823;
        int sixthChecker = 566;
        int fourthChecker = 374;
        int fifthChecker = 591;
        int firstChecker = 870;
        int thirdChecker = 889;
        for (int currentItem : arr) {
            if ((firstChecker & thirdChecker) != 0) {
                if ((fourthChecker & fifthChecker) != 0) {
                    if ((secondChecker & sixthChecker) != 0) {
                        if (currentItem + 1 < arr.length && currentItem + 2 < arr.length) {
                            System.out.println("YES");
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}