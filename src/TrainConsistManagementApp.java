package TrainConsistManagementApp;
import java.util.*;
import java.util.stream.*;
class Bogie {
    String type;
    int capacity;
    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
}
 class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("==================================================\n");
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 50 + (i % 30))); // capacities vary
        }
        long startLoop = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;
        long startStream = System.nanoTime();
        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);
        System.out.println("\nUC13 performance benchmarking completed...");
    }
}