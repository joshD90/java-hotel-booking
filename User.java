public class User {

	private String name;
	private String email;
	private int id;

	User(String name, String email, int id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}

	public void sendRoomPreferences() {
		// TODO - implement User.sendRoomPreferences
		throw new UnsupportedOperationException();
	}

	public void selectRoom() {
		// TODO - implement User.selectRoom
		throw new UnsupportedOperationException();
	}

	public void enterPaymentDetails() {
		// TODO - implement User.enterPaymentDetails
		throw new UnsupportedOperationException();
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