import java.time.LocalDate;
import java.util.ArrayList;

public class Room {

	private ArrayList<LocalDate> datesBooked;
	private double roomPrice;
	private String roomType;

	// Constructor
	public Room(double roomPrice, String roomType, ArrayList<LocalDate> dates) {
		// would like to have the option not to pass all the dates through
		this.datesBooked = dates != null ? dates : new ArrayList<LocalDate>();
		this.roomPrice = roomPrice;
		this.roomType = roomType;
	}

	public boolean checkIsRoomAvailable(LocalDate dateToCheck) {
		// little helper function to check whether the date in question has been booked
		// already
		for (int i = 0; i < datesBooked.size(); i++) {
			if (dateToCheck.isEqual(datesBooked.get(i))) {
				// return false from the entire function
				return false;
			}
		}
		// if we have gotten this far its not already booked
		return true;
	}

	// Getters
	public ArrayList<LocalDate> getDatesBooked() {
		return datesBooked;
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public String getRoomType() {
		return roomType;
	}

	// Setters
	// Add in dates booked, push them onto the ArrayList
	public void addDatesBooked(ArrayList<LocalDate> datesBooked) {
		// for every date booked, push it onto the array
		for (int i = 0; i < datesBooked.size(); i++) {
			LocalDate currentDate = datesBooked.get(i);
			this.datesBooked.add(currentDate);
		}
	}

	// remove dates booked
	public void removeDatesBooked(ArrayList<LocalDate> datesToRemove) {
		// for every one of the dates in the list we run through them
		for (int i = 0; i < datesToRemove.size(); i++) {
			LocalDate currentDateToRemove = datesToRemove.get(i);
			// and see do they match any of the dates within the array.
			for (LocalDate date : this.datesBooked) {
				// if so remove those dates
				if (currentDateToRemove.isEqual(date)) {
					this.datesBooked.remove(date);
				}
			}
		}
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

}