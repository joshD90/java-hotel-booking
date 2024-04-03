import java.time.LocalDate;
import java.util.ArrayList;

public class BookingManager {

    public void checkAvailable(Hotel hotel, LocalDate startDate, LocalDate endDate) {
        LocalDate[] datesToCheck = createDatesFromStartToEnd(startDate, endDate);
        ArrayList<Room> roomsAvailable = hotel.returnRoomsAvailable(datesToCheck);
        System.out.println(roomsAvailable + "rooms available");
        System.out.println(roomsAvailable.size());
    }

    public void bookIntoRoom() {
        // TODO - implement BookingManagementController.bookIntoRoom
        throw new UnsupportedOperationException();
    }

    public void createBooking() {
        // TODO - implement BookingManagementController.createBooking
        throw new UnsupportedOperationException();
    }

    public void sendBookingConfirmationEmail() {
        // TODO - implement BookingManagementController.sendBookingConfirmationEmail
        throw new UnsupportedOperationException();
    }

    public void viewAllBookings() {
        // TODO - implement BookingManagementController.viewAllBookings
        throw new UnsupportedOperationException();
    }

    public void returnRoomsAvailable() {
        // TODO - implement BookingManagementController.returnRoomsAvailable
        throw new UnsupportedOperationException();
    }

    public void returnAlternativeRooms() {
        // TODO - implement BookingManagementController.returnAlternativeRooms
        throw new UnsupportedOperationException();
    }

    // this method creates dates from date to and date from strings
    public LocalDate[] createDatesFromStartToEnd(LocalDate startDate, LocalDate endDate) {
        // check have the dates been entered correctly
        if (startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("Start Date Must be Before End Date");
        }
        // we want to iterate through the number of days and use plusDays to get the
        // full array
        int gapSize = endDate.getDayOfYear() - startDate.getDayOfYear();
        LocalDate[] datesBetweenInclusive = new LocalDate[gapSize];
        // startDate.plusDays(i) is the date that is i days ahead of the startDate
        for (int i = 0; i < gapSize; i++) {
            datesBetweenInclusive[i] = startDate.plusDays(i);
        }
        return datesBetweenInclusive;
    }

}