package TrainConsistManagementApp;
 class TrainConsistManagementApp  {
    public static void main(String[] args) {
        int[] capacities = {72, 56, 24, 70, 60};
        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("=======================================");
        System.out.println("\nOriginal Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
        System.out.println("\n\nUC16 sorting completed...");
    }
}