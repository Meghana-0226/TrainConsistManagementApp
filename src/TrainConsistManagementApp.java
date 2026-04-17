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

    void display() {
        System.out.println(type + " -> " + capacity);
    }
}

class TrainConsistManagementApp{
    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("General", 90)
        );

        System.out.println("UC8 - Filter Passenger Bogies Using Streams\n");

        System.out.println("All Bogies:");
        bogies.forEach(b -> b.display());

        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(b -> b.display());

        System.out.println("\nUC8 filtering completed...");
    }
}