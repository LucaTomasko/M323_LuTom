import java.util.List;

public class Main {

    // Pure Function zur Berechnung des Trinkgeld-Prozentsatzes
    public static int calculateTipPercentage(List<String> names) {
        int size = names.size();
        if (size == 0) {
            return 0;
        } else if (size <= 5) {
            return 10;
        } else {
            return 20;
        }
    }

    public static void main(String[] args) {
        List<String> group1 = List.of("Alice", "Bob", "Charlie");
        List<String> group2 = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        System.out.println("Group 1 Tip Percentage: " + calculateTipPercentage(group1) + "%");
        System.out.println("Group 2 Tip Percentage: " + calculateTipPercentage(group2) + "%");

        List<String> emptyGroup = List.of();
        System.out.println("Empty Group Tip Percentage: " + calculateTipPercentage(emptyGroup) + "%");
    }
}