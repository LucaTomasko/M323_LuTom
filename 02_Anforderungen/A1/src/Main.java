import java.util.List;
import java.util.ArrayList;

public class Main {

    // Funktion zum Hinzufügen einer Destination
    public static List<String> addDestination(List<String> route, String destination) {
        List<String> newRoute = new ArrayList<>(route);
        newRoute.add(destination);
        return newRoute;
    }

    // Funktion zum Entfernen einer Destination
    public static List<String> removeDestination(List<String> route, String destination) {
        List<String> newRoute = new ArrayList<>(route);
        newRoute.remove(destination);
        return newRoute;
    }

    // Funktion zum Ändern einer bestehenden Destination
    public static List<String> updateDestination(List<String> route, int index, String newDestination) {
        List<String> newRoute = new ArrayList<>(route);
        if (index >= 0 && index < newRoute.size()) {
            newRoute.set(index, newDestination);
        }
        return newRoute;
    }

    // Funktion zum Abrufen der aktuellen Route
    public static List<String> getRoute(List<String> route) {
        return new ArrayList<>(route);
    }

    public static void main(String[] args) {
        List<String> route = new ArrayList<>();
        route = addDestination(route, "Paris");
        route = addDestination(route, "Berlin");
        route = addDestination(route, "Rome");

        System.out.println("Route: " + getRoute(route));

        route = updateDestination(route, 1, "Amsterdam");
        System.out.println("Updated Route: " + getRoute(route));

        route = removeDestination(route, "Rome");
        System.out.println("Final Route: " + getRoute(route));
    }
}