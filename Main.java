import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> guestList = new ArrayList<>();

        guestList.add("Alice");
        guestList.add("Bob");
        guestList.add("Charlie");
        guestList.add("Alice");
        guestList.add("David");

        HashSet<String> uniqueGuests = new HashSet<>();
        uniqueGuests.addAll(guestList);

        System.out.println("Total names in ArrayList: " + guestList.size());
        System.out.println("Total unique names in HashSet: " + uniqueGuests.size());

        String searchName = "Alice";

        if (uniqueGuests.contains(searchName)) {
            System.out.println(searchName + " is in the guest list.");
        } else {
            System.out.println(searchName + " is NOT in the guest list.");
        }
    }
}