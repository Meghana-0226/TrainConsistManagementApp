package TrainConsistManagementApp;
import java.util.Arrays;
public class TrainConsistManagementApp {
    public static boolean searchBogie(String[] bogies, String key) {

        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }
        Arrays.sort(bogies);
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
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("=========================================");
        String[] bogies = {};
        String searchKey = "BG101";
        boolean found = searchBogie(bogies, searchKey);
        if (found) {
            System.out.println("Bogie " + searchKey + " found.");
        } else {
            System.out.println("Bogie " + searchKey + " not found.");
        }
    }
}