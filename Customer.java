public class Customer extends User {

	private int contactNumber;

	Customer(String name, String email, int id, int contactNumber, BookingManager bookingManager) {
		super(name, email, id, bookingManager);
		this.contactNumber = contactNumber;
	}

	// getters
	public int getContactNumber() {
		return contactNumber;
	}

	// setters
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

}