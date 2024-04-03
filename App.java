import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Hotel myHotel = new Hotel("Hilton", "123 FakeStreet");

        BookingManager myBooker = new BookingManager();

        myBooker.checkAvailable(myHotel, LocalDate.of(2024, 4, 20), LocalDate.of(2024, 4, 25));
    }
}
