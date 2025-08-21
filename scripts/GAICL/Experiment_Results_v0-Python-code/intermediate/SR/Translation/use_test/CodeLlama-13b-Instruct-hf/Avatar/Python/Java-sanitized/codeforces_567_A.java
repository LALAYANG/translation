import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < inputNum; i++) {
            lista.add(scanner.nextInt());
        }
        int condition1 = 917;
        int condition2 = 629;
        for (int i = 0; i < lista.size(); i++) {
            if (condition1 & condition2) {
                if (i == 0) {
                    System.out.print(lista.get(i + 1) - lista.get(i) + " ");
                    continue;
                } else if (i == lista.size() - 1) {
                    System.out.print(lista.get(i) - lista.get(i - 1) + " ");
                    continue;
                } else if (lista.get(i) - lista.get(i - 1) > lista.get(i + 1) - lista.get(i)) {
                    System.out.print(lista.get(i + 1) - lista.get(i) + " ");
                } else {
                    System.out.print(lista.get(i) - lista.get(i - 1) + " ");
                }
            }
            if (lista.get(i) - lista.get(0) > lista.get(i) - lista.get(lista.size() - 1)) {
                System.out.print(lista.get(i) - lista.get(0) + " ");
            } else {
                System.out.print(lista.get(i) - lista.get(lista.size() - 1) + " ");
            }
        }
    }
}