```java
import java.util.*;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < array_size; i++) {
            A.add(sc.nextInt());
        }
        int termination_condition = 565;
        int loop_step = 564;

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_indices = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_indices[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_indices[A.get(i) - 1].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_indices[i]);
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array[i].add(A.get(i));
            sorted_array[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array[i], new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_2 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_2[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_2[i].add(A.get(i));
            sorted_array_2[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_2[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_3 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_3[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_3[i].add(A.get(i));
            sorted_array_3[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_3[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_4 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_4[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_4[i].add(A.get(i));
            sorted_array_4[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_4[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_5 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_5[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_5[i].add(A.get(i));
            sorted_array_5[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_5[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_6 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_6[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_6[i].add(A.get(i));
            sorted_array_6[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_6[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_7 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_7[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_7[i].add(A.get(i));
            sorted_array_7[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_7[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_8 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_8[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_8[i].add(A.get(i));
            sorted_array_8[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_8[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_9 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_9[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_9[i].add(A.get(i));
            sorted_array_9[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_9[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_10 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_10[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_10[i].add(A.get(i));
            sorted_array_10[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_10[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_11 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_11[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_11[i].add(A.get(i));
            sorted_array_11[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_11[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_12 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_12[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_12[i].add(A.get(i));
            sorted_array_12[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_12[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_13 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
            sorted_array_13[i] = new ArrayList<>();
        }
        for (int i = 0; i < array_size; i++) {
            sorted_array_13[i].add(A.get(i));
            sorted_array_13[i].add(i + 1);
        }
        for (int i = 0; i < array_size; i++) {
            Collections.sort(sorted_array_13[i], (o1, o2) -> o1.compareTo(o2));
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] sorted_array_14 = new List[array_size];
        for (int i = 0; i < array_size; i++) {
           
