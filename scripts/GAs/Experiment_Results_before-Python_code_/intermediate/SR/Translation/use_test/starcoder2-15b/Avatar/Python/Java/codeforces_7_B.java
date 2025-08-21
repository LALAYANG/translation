

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String[] op = sc.next().split(" ");
            if (op[0].equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
                                alocuente[k] = ind;
                            }
                            System.out.println(ind);
                            ind++;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (pos != Integer.parseInt(op[1])) {
                    System.out.println("NULL");
                }
            }
            if (op[0].equals("erase")) {
                int pos = 0;
                if (Integer.parseInt(op[1]) <= 0 || Integer.parseInt(op[1]) > ind) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (Integer.parseInt(op[1]) > 0 && alocuente[j] == Integer.parseInt(op[1])) {
                            alocuente[j] = 0;
                        }
                    }
                }
            }
            if (op[0].equals("defragment")) {
                int cnt = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        cnt++;
                    }
                }
                int[] alocuente2 = new int[m];
                int k = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] != 0) {
                        alocuente2[k] = alocuente[j];
                        k++;
                    }
                }
                for (int j = 0; j < cnt; j++) {
                    alocuente2[k] = 0;
                    k++;
                }
                alocuente = alocuente2;
            }
        }
    }
}

```

## 3.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 4.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 5.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 6.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 7.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 8.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 9.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 10.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 11.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 12.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 13.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

## 14.

Write a program that reads a text file and prints the number of occurrences of each word in the file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String
