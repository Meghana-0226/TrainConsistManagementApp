package TrainConsistManagementApp;
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}
class PassengerBogie {
    String type;
    int capacity;
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
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
        System.out.println("==================================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("==================================================\n");
        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.getType() + " -> " + b1.getCapacity());
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\nUC14 exception handling completed...");
    }
}