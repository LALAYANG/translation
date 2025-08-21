import java.util.*;

class Main {
    static int game_turns = -1;
    static int counter = 0;
    static int first_condition = 824;
    static int second_condition = 121;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        Collections.shuffle(a);
        while (counter < a.size()) {
            game_turns++;
            recursive_loop(a, 0, a.size(), 1);
            Collections.reverse(a);
        }
        System.out.println(game_turns);
    }

    public static void recursive_loop(ArrayList<Integer> a, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((first_condition & second_condition) != 0) {
            if (a.get(i) != -1 && a.get(i) <= counter) {
                counter++;
                a.set(i, -1);
            }
        }
        recursive_loop(a, i + step, stop, step);
    }
}