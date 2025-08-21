import java.util.Scanner;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        int[] sortedList = new int[count];
        
        for (int i = 0; i < count; i++) {
            sortedList[i] = scanner.nextInt();
        }
        
        for (int value : sortedList) {
            if (value + 1 < sortedList.length && value + 2 < sortedList.length) {
                if (sortedList[value + 1] == sortedList[value] + 1 && sortedList[value + 2] == sortedList[value] + 2) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        
        System.out.println("NO");
    }
}