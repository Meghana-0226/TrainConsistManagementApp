import java.util.LinkedHashSet;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        LinkedHashSet<String> train = new LinkedHashSet<>();
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");
        train.add("Sleeper");
        System.out.println("===================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===================================");
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println("\nUC5 formation setup completed...");
    }
}