package TrainConsistManagementApp;
import java.util.regex.*;
 class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("==================================================\n");
        String trainId = "TRN-6524";
        String cargoCode = "PET-FH";
        System.out.println("Enter Train ID (Format: TRN-1234): " + trainId);
        System.out.println("Enter Cargo Code (Format: PET-AB): " + cargoCode);
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);
        System.out.println("\nUC11 validation completed...");
    }
}