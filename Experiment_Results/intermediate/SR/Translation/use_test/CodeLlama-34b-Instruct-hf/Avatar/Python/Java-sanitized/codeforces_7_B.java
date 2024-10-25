import java.util.Scanner;

public class codeforces_7_B {
    private int[] memory;
    private int size;
    private int nextIndex;

    public MemoryManager(int size) {
        this.size = size;
        this.memory = new int[size];
        this.nextIndex = 0;
    }

    public int alloc(int size) {
        if (size <= 0) {
            return -1;
        }

        int startIndex = nextIndex;
        int endIndex = startIndex + size - 1;

        if (endIndex >= memory.length) {
            return -1;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            if (memory[i] != 0) {
                return -1;
            }
        }

        for (int i = startIndex; i <= endIndex; i++) {
            memory[i] = nextIndex + 1;
        }

        nextIndex = endIndex + 1;
        return startIndex;
    }

    public void erase(int index) {
        if (index < 0 || index >= memory.length) {
            return;
        }

        if (memory[index] == 0) {
            return;
        }

        int startIndex = index;
        int endIndex = startIndex + memory[index] - 1;

        for (int i = startIndex; i <= endIndex; i++) {
            memory[i] = 0;
        }
    }

    public void defragment() {
        int[] newMemory = new int[memory.length];
        int newNextIndex = 0;

        for (int i = 0; i < memory.length; i++) {
            if (memory[i] != 0) {
                newMemory[newNextIndex] = memory[i];
                newNextIndex++;
            }
        }

        memory = newMemory;
        nextIndex = newNextIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        MemoryManager memoryManager = new MemoryManager(size);

        while (scanner.hasNext()) {
            String command = scanner.next();
            if (command.equals("alloc")) {
                int size = scanner.nextInt();
                int index = memoryManager.alloc(size);
                if (index == -1) {
                    System.out.println("NULL");
                } else {
                    System.out.println(index);
                }
            } else if (command.equals("erase")) {
                int index = scanner.nextInt();
                memoryManager.erase(index);
            } else if (command.equals("defragment")) {
                memoryManager.defragment();
            }
        }

        scanner.close();
    }
}