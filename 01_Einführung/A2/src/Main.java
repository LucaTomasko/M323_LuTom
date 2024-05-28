import java.util.List;

public class Main {

    // Funktion zur Berechnung des Rabatts
    public static double getDiscountPercentage(List<String> cartItems) {
        boolean bookAdded = cartItems.stream().anyMatch(item -> item.toLowerCase().contains("book"));
        return bookAdded ? 0.05 : 0.0;
    }

    public static void main(String[] args) {
        List<String> cartItems = List.of("Laptop", "Book: Java Programming");

        System.out.println("Cart Items: " + cartItems);
        System.out.println("Discount: " + getDiscountPercentage(cartItems) * 100 + "%");

        cartItems = List.of("Laptop");

        System.out.println("Cart Items: " + cartItems);
        System.out.println("Discount: " + getDiscountPercentage(cartItems) * 100 + "%");
    }
}