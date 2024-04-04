public class HotelWorker extends User {

	private String password;

	HotelWorker(String name, String email, int id, String password, BookingManager bookingManager) {
		super(name, email, id, bookingManager);
		this.password = password;
	}

	// getters
	public String getPassword() {
		return this.password;
	}

	// setters
	public void setPassword(String password) {
		this.password = password;
	}

}