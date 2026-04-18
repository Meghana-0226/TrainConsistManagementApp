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
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("==============================================\n");
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70)
        );
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.getType() + " -> " + b.getCapacity());
        }
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);
        System.out.println("\nUC10 aggregation completed...");
    }
}