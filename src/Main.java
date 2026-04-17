package TrainConsistManagementApp;

class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("=======================================\n");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Search key
        String searchId = "BG309";
        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // stop when found
            }
        }

        // Result
        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " not found.");
        }

        System.out.println("\nUC18 search completed...");
    }
}