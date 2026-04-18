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
    public String getType() {
        return type;
    }
    public int getCapacity() {
        return capacity;
    }
}
 class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("==============================================\n");
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );
        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.getType() + " -> " + b.getCapacity());
        }
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));
        System.out.println("\nGrouped Bogies:\n");
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  Capacity -> " + b.getCapacity());
            }
            System.out.println();
        }
        System.out.println("UC9 grouping completed...");
    }
}