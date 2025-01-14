
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


class Reservation {
    private int id;
    private String name;
    private String date;
    private int numberOfGuests;


    public Reservation(int id, String name, String date, int numberOfGuests) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.numberOfGuests = numberOfGuests;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getDate() {
        return date;
    }


    public int getNumberOfGuests() {
        return numberOfGuests;
    }
}


class ReservationSystem {
    private List<Reservation> reservations = new ArrayList<>();
    private int nextId = 1;


    public Reservation makeReservation(String name, String date, int numberOfGuests) {
        Reservation reservation = new Reservation(nextId++, name, date, numberOfGuests);
        reservations.add(reservation);
        return reservation;
    }


    public List<Reservation> getReservations() {
        return reservations;
    }


    public Reservation getReservationById(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getId() == id) {
                return reservaton;
            }
        }
        return null;
    }


    public boolean cancelReservation(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getId() == id) {
                reservations.remove(reservation);
                return true; // Successfully cancelled
            }
        }
        return false; // Reservation not found
    }
}
