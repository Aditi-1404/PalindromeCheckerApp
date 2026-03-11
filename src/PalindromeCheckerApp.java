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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Handles room booking and reservation creation.
 */
public class ReservationService {

    private RoomInventory inventory;
    private List<Reservation> reservations;

    public ReservationService(RoomInventory inventory) {
        this.inventory = inventory;
        this.reservations = new ArrayList<>();
    }

    /**
     * Books a room if available and creates a reservation.
     */
    public void bookRoom(String guestName, String roomType, Room room) {

        int available = inventory.getAvailability(roomType);

        if (available > 0) {

            // Reduce inventory
            inventory.updateAvailability(roomType, available - 1);

            // Generate reservation ID
            String reservationId = UUID.randomUUID().toString().substring(0, 8);

            Reservation reservation = new Reservation(
                    reservationId,
                    guestName,
                    roomType,
                    room.price
            );

            reservations.add(reservation);

            System.out.println("\nBooking Successful!");
            reservation.displayReservation();

        } else {
            System.out.println("\nSorry, no " + roomType + " available.");
        }
    }

    public void showAllReservations() {

        System.out.println("\nAll Reservations");
        System.out.println("----------------");

        for (Reservation r : reservations) {
            r.displayReservation();
            System.out.println();
        }
    }
}