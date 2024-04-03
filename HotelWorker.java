public class HotelWorker extends User {

	private String password;

	HotelWorker(String name, String email, int id, String password) {
		super(name, email, id);
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