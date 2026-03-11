/**
 * HotelBookingApplication
 *
 * This class represents the entry point of the Hotel Booking application.
 * It demonstrates how a Java program begins execution and produces
 * console output.
 *
 * The application prints a welcome message along with the
 * application name and version information.
 *
 * @author Arieve
 * @version 1.0
 */
/**
 * HotelBookingApplication
 *
 * This class represents the entry point of the Hotel Booking application.
 * It demonstrates how a Java program begins execution and produces
 * console output.
 *
 * The application prints a welcome message along with the
 * application name and version information.
 *
 * @author Arieve
 * @version 1.0
 */
p/**
 * HotelBookingApp
 *
 * This class represents the entry point of the Hotel Booking application.
 * It demonstrates how a Java program begins execution and prints
 * basic information to the console.
 *
 * The program prints a welcome message along with the application
 * name and version when it starts.
 *
 * @author Arieve
 * @version 1.0
 */
/**
 * Abstract representation of a Room in the hotel.
 * This class defines the common structure for all room types.
 */
import java.util.HashMap;
import java.util.Map;

/**
 * RoomInventory
 *
 * This class manages the availability of different room types
 * using a centralized HashMap structure.
 *
 * It acts as the single source of truth for room availability
 * across the system.
 */
public class RoomInventory {

    private Map<String, Integer> inventory;

    /**
     * Constructor initializes room availability.
     */
    public RoomInventory() {
        inventory = new HashMap<>();

        // Register room types with initial availability
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    /**
     * Returns current availability for a given room type.
     */
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    /**
     * Updates availability for a specific room type.
     */
    public void updateAvailability(String roomType, int newCount) {
        inventory.put(roomType, newCount);
    }

    /**
     * Displays the current inventory state.
     */
    public void displayInventory() {
        System.out.println("Current Room Inventory:");
        System.out.println("------------------------");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " available");
        }
    }
}