package TrainConsistManagementApp;
import java.util.*;
import java.util.stream.*;
class GoodsBogie {
    String type;
    String cargo;
    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
    public String getType() {
        return type;
    }
    public String getCargo() {
        return cargo;
    }
}
 class  TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("==================================================\n");
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Box", "Grain"),
                new GoodsBogie("Cylindrical", "Coal") // invalid case
        );
        System.out.println("Goods Bogies in Train:");
        for (GoodsBogie b : bogies) {
            System.out.println(b.getType() + " -> " + b.getCargo());
        }
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical") ||
                                b.getCargo().equals("Petroleum")
                );
        System.out.println("\nSafety Compliance Status: " + isSafe);
        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }
        System.out.println("\nUC12 safety validation completed...");
    }
}