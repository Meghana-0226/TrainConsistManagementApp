import java.util.LinkedList;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        LinkedList<String> train = new LinkedList<>();
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");
        System.out.println("===================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("===================================");
        System.out.println("\nInitial Train Consist:");
        System.out.println(train);
        train.add(2, "Pantry Car");
        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(train);
        train.removeFirst();
        train.removeLast();
        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);
        System.out.println("\nUC4 ordered consist operations completed...");
    }
}