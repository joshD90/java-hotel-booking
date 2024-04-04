import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Hotel myHotel = new Hotel("Hilton", "123 FakeStreet");

        BookingManager myBooker = new BookingManager(myHotel);
        User myUser = new User("John Smith", "johnsmith@gmail.com", 1, myBooker);

        myBooker.checkAvailable(LocalDate.of(2024, 4, 20), LocalDate.of(2024, 4, 25));

        // this will in turn call the booking manager which will call the hotel which
        // will return the rooms
        myUser.sendRoomPreferences();

        myUser.selectRoom();
    }
}
