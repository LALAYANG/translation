import java.util.Scanner;

public class codeforces_7_B {
    private int[] memory;
    private int memorySize;
    private int memoryUsed;

    public MemoryManager(int memorySize) {
        this.memorySize = memorySize;
        this.memory = new int[memorySize];
        this.memoryUsed = 0;
    }

    public int alloc(int size) {
        if (size <= 0) {
            return -1;
        }

        int startIndex = 0;
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == 0) {
                startIndex = i;
                break;
            }
        }

        int endIndex = startIndex + size - 1;
        if (endIndex >= memory.length) {
            return -1;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            memory[i] = 1;
        }

        memoryUsed += size;
        return startIndex;
    }

    public void erase(int index) {
        if (index < 0 || index >= memory.length) {
            return;
        }

        if (memory[index] == 0) {
            return;
        }

        memory[index] = 0;
        memoryUsed--;
    }

    public void defragment() {
        int[] newMemory = new int[memorySize];
        int newMemoryUsed = 0;

        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == 1) {
                newMemory[newMemoryUsed++] = 1;
            }
        }

        memory = newMemory;
        memoryUsed = newMemoryUsed;
    }

    public int getMemoryUsed() {
        return memoryUsed;
    }
}