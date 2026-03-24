import java.util.HashMap;
import java.util.Map;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        HashMap<String, Integer> bogieMap = new HashMap<>();
        bogieMap.put("First Class", 24);
        bogieMap.put("Cargo", 120);
        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 56);
        System.out.println("===================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("===================================");
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}