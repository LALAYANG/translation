MemoryManager memoryManager = new MemoryManager(10);
memoryManager.initializeMemory();
int index = memoryManager.allocateMemory(5);
memoryManager.eraseMemory(index);
memoryManager.defragment();