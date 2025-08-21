import java.util.*;
import java.util.stream.Collectors;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        List<Integer> lista = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int condition_1 = 917;
        int condition_2 = 629;
        for (int index = 0; index < lista.size(); index++) {
            if ((condition_1 & condition_2) != 0) {
                if (index == 0) {
                    System.out.println((lista.get(index + 1) - lista.get(index)) + " " + (lista.get(lista.size() - 1) - lista.get(index)));
                    continue;
                } else if (index == lista.size() - 1) {
                    System.out.println((lista.get(lista.size() - 1) - lista.get(lista.size() - 2)) + " " + (lista.get(lista.size() - 1) - lista.get(0)));
                    continue;
                } else if (lista.get(index) - lista.get(index - 1) > lista.get(index + 1) - lista.get(index)) {
                    System.out.print((lista.get(index + 1) - lista.get(index)) + " ");
                } else {
                    System.out.print((lista.get(index) - lista.get(index - 1)) + " ");
                }
            }
            if (lista.get(lista.size() - 1) - lista.get(index) > lista.get(index) - lista.get(0)) {
                System.out.println(lista.get(lista.size() - 1) - lista.get(index));
            } else {
                System.out.println(lista.get(index) - lista.get(0));
            }
        }
    }
}