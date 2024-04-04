import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Booking {

	private LocalDate dateFrom;
	private int room;
	private LocalDate dateTo;
	private String userEmail;
	private LocalDateTime createdAt;

	// Constructor
	public Booking(LocalDate dateFrom, LocalDate dateTo, int room, String userEmail) {
		this.dateFrom = dateFrom;
		this.room = room;
		this.dateTo = dateTo;
		this.userEmail = userEmail;
		// Set createdAt to the current time
		this.createdAt = LocalDateTime.now();
	}

	// Getters and Setters
	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(LocalDate dateFrom) {
		this.dateFrom = dateFrom;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public LocalDate getDateTo() {
		return dateTo;
	}

	public void setDateTo(LocalDate dateTo) {
		this.dateTo = dateTo;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	// No setter for createdAt since it's set in the constructor and shouldn't
	// change
}
