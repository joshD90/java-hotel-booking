import java.time.LocalDateTime;
import java.util.Date;

public class Booking {

	private Date dateFrom;
	private int room;
	private Date dateTo;
	private String userEmail;
	private LocalDateTime createdAt;

	// Constructor
	public Booking(Date dateFrom, int room, Date dateTo, String userEmail) {
		this.dateFrom = dateFrom;
		this.room = room;
		this.dateTo = dateTo;
		this.userEmail = userEmail;
		// Set createdAt to the current time
		this.createdAt = LocalDateTime.now();
	}

	// Getters and Setters
	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
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
