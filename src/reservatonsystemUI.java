public class reservatonsystemUI {
    private ReservationSystem reservationSystem = new reservation ();
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Make a reservation");
            System.out.println("2. View all reservations");
            System.out.println("3. Cancel a reservation");
            System.out.println("4. Exit");
        }
        
    }
}
