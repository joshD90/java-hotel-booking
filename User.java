import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class User {

	private String name;
	private String email;
	private int id;
	private ArrayList<Booking> bookings = new ArrayList<>();
	private BookingManager bookingManager;

	// rooms available
	private ArrayList<Room> roomsAvailable;
	// dates looked for - we'll keep these stored as we reuse them through the
	// lifecycle of the booking
	private LocalDate startDate;
	private LocalDate endDate;

	// we use dependency injection when passing the booking manager to the
	// constructor of the user. This allows the user to call methods from the
	// booking manager. The user is our entry point to the system
	User(String name, String email, int id, BookingManager bookingManager) {
		this.name = name;
		this.email = email;
		this.id = id;
		this.bookingManager = bookingManager;
	}

	public void sendRoomPreferences() {
		// this focuses on capturing input from the user. Let the App class call the
		// booking manager which will handle the selection etc.
		startDate = captureUserInputAsDate();
		endDate = captureUserInputAsDate();
		this.roomsAvailable = bookingManager.checkAvailable(startDate, endDate);

	}

	public void selectRoom() {
		// use string builder as we are doing this in a loop so it can be done through
		// mutation
		StringBuilder strBuilder = new StringBuilder("You have a selection of rooms:");
		for (int i = 1; i < roomsAvailable.size() + 1; i++) {
			strBuilder.append(" Room" + i);
		}
		// new line character
		strBuilder.append(" /n Enter the number of room you wish");
		// put the message to the user
		int roomSelectionInt = Integer.parseInt(JOptionPane.showInputDialog(strBuilder.toString()));

		Booking newBooking = bookingManager.bookIntoRoom(roomSelectionInt, startDate, endDate, this);
		bookings.add(newBooking);
		System.out.println(bookings);

	}

	public void enterPaymentDetails() {
		// TODO - implement User.enterPaymentDetails
		throw new UnsupportedOperationException();
	}

	private LocalDate captureUserInputAsDate() {
		String userInput = JOptionPane.showInputDialog("Enter the date in the format DD/MM/YYYY");
		String[] splitFormat = userInput.split("/");

		LocalDate date = LocalDate.of(Integer.parseInt(splitFormat[2]), Integer.parseInt(splitFormat[1]),
				Integer.parseInt(splitFormat[0]));
		return date;
	}

	// getters
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;

	}

	// setters
	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

}