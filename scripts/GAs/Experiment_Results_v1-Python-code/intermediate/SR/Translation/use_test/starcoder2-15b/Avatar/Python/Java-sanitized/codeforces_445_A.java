import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_lines = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[] l = new String[num_lines];
        for (int i = 0; i < num_lines; i++) {
            l[i] = sc.nextLine();
        }
        for (int i = 0; i < num_lines; i++) {
            for (int j = 0; j < m; j++) {
                if (l[i].charAt(j) == '.') {
                    if ((i + j) % 2 == 0) {
                        l[i] = l[i].substring(0, j) + 'B' + l[i].substring(j + 1);
                    } else {
                        l[i] = l[i].substring(0, j) + 'W' + l[i].substring(j + 1);
                    }
                }
            }
        }
        for (int i = 0; i < num_lines; i++) {
            System.out.println(l[i]);
        }
    }
}