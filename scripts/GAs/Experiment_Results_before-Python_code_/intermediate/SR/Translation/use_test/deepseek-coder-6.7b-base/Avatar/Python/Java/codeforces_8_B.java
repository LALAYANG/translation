
```

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String record_of_movements = sc.nextLine();
        int x = 0, y = 0;
        HashMap<String, int[]> d_movement = new HashMap<>();
        d_movement.put("L", new int[]{0, -1});
        d_movement.put("R", new int[]{0, 1});
        d_movement.put("U", new int[]{1, 0});
        d_movement.put("D", new int[]{-1, 0});
        HashMap<String, String> d = new HashMap<>();
        d.put(x + "," + y, "");
        boolean bug = false;
        for (int i = 0; i < record_of_movements.length(); i++) {
            String move = record_of_movements.substring(i, i + 1);
            int[] temp = new int[]{x, y};
            x += d_movement.get(move)[0];
            y += d_movement.get(move)[1];
            if (!d.containsKey(x + "," + y)) {
                for (String step : d_movement.keySet()) {
                    if (!Arrays.equals(temp, new int[]{x + d_movement.get(step)[0], y + d_movement.get(step)[1]}) && d.containsKey(x + d_movement.get(step)[0] + "," + y + d_movement.get(step)[1])) {
                        bug = true;
                        break;
                    }
                }
            } else {
                bug = true;
            }
            if (bug) {
                break;
            }
            d.put(x + "," + y, "");
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}


```

