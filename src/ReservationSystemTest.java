import java.util.List;

public class ReservationSystemTest {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        // Test case for making a reservation
        System.out.println("Testing making a reservation...");
        Reservation reservation1 = reservationSystem.makeReservation("Vix", "2007/03/16", 4);
        assert reservation1.getId() == 1;
        assert reservation1.getName().equals("Vix");
        assert reservation1.getDate().equals("2007/03/16");
        assert reservation1.getNumberOfGuests() == 4;
        System.out.println("Test passed.");

        // Test case for getting reservations
        System.out.println("Testing getting reservations...");
        List<Reservation> reservations = reservationSystem.getReservations();
        assert reservations.size() == 2;
        assert reservations.get(0).getName().equals("Vix");
        assert reservations.get(1).getName().equals("Sukaina");
        System.out.println("Test passed.");

        // Test case for getting a reservation by ID
        System.out.println("Testing getting a reservation by ID...");
        Reservation res = reservationSystem.getReservationById(1);
        assert res != null;
        assert res.getName().equals("Vix");
        Reservation notFound = reservationSystem.getReservationById(99);
        assert notFound == null;
        System.out.println("Test passed.");

        // Test case for canceling a reservation
        System.out.println("Testing canceling a reservation...");
        boolean cancelSuccess = reservationSystem.cancelReservation(1);
        assert cancelSuccess;
        assert reservationSystem.getReservations().size() == 1;
        boolean cancelFail = reservationSystem.cancelReservation(99);
        assert !cancelFail;
        System.out.println("Test passed.");
    }
}
