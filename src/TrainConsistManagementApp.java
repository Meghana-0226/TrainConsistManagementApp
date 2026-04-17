package TrainConsistManagementApp;
import java.util.Arrays;
 class TrainConsistManagementApp {
    public static boolean binarySearch(String[] bogies, String key) {
        int low = 0;
        int high = bogies.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = key.compareTo(bogies[mid]);
            if (result == 0) {
                return true;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("=========================================");
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        Arrays.sort(bogies);
        System.out.println("\nSorted Bogie IDs:");
        for (String b : bogies) {
            System.out.println(b);
        }
        String searchKey = "BG309";
        boolean found = binarySearch(bogies, searchKey);
        if (found) {
            System.out.println("\nBogie " + searchKey + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + searchKey + " not found.");
        }
        System.out.println("\nUC19 search completed...");
    }
}