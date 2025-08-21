```java
import java.util.Scanner;

public class MemoryManager {
    private int[] memory;
    private int availableSlots;
    private int nextAvailableSlot;

    public MemoryManager(int memorySize) {
        this.memory = new int[memorySize];
        this.availableSlots = memorySize;
        this.nextAvailableSlot = 0;
    }

    public int alloc(int size) {
        if (size > availableSlots) {
            return -1;
        }

        int startIndex = nextAvailableSlot;
        for (int i = startIndex; i < memory.length; i++) {
            if (memory[i] == 0) {
                memory[i] = size;
                availableSlots -= size;
                nextAvailableSlot = i + 1;
                return i;
            }
        }

        return -1;
    }

    public void erase(int index) {
        if (index < 0 || index >= memory.length) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }

        if (memory[index] == 0) {
            return;
        }

        memory[index] = 0;
        availableSlots += memory[index];
    }

    public void defragment() {
        int[] newMemory = new int[memory.length];
        int newNextAvailableSlot = 0;

        for (int i = 0; i < memory.length; i++) {
            if (memory[i] != 0) {
                newMemory[newNextAvailableSlot] = memory[i];
                newNextAvailableSlot++;
            }
        }

        memory = newMemory;
        nextAvailableSlot = newNextAvailableSlot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memorySize = scanner.nextInt();
        MemoryManager memoryManager = new MemoryManager(memorySize);

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
                try {
                    memoryManager.erase(index);
                } catch (IllegalArgumentException e) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                }
            } else if (command.equals("defragment")) {
                memoryManager.defragment();
            }
        }

        scanner.close();
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a similar approach to manage the memory, but it is written in Java and uses Java's built-in data structures and syntax.
