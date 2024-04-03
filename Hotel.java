import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {

	private String name;
	private String address;
	private Room[] hotelRooms = new Room[20];

	Hotel(String name, String address) {
		this.name = name;
		this.address = address;
		// create our rooms upon creation of the hotel
		createRooms();

	}

	public ArrayList<Room> returnRoomsAvailable(LocalDate[] dates) {
		ArrayList<Room> roomsAvailable = new ArrayList<Room>();
		// we iterate through all our rooms
		for (Room room : hotelRooms) {

			for (int i = 0; i < dates.length; i++) {
				// if our rooms at any point do not have available for any one of the dates,
				// skip over to the next room
				boolean roomAvailable = room.checkIsRoomAvailable(dates[i]);
				if (roomAvailable == false) {
					break;
				}
				// but if we have gotten all the way to the end of every date possible and they
				// are all free - add it to our list of rooms available
				if (roomAvailable == true && i == dates.length - 1) {
					roomsAvailable.add(room);
				}

			}
		}
		return roomsAvailable;
	}

	public void returnAlternativeRooms() {
		// TODO - implement Hotel.returnAlternativeRooms
		throw new UnsupportedOperationException();
	}

	public void reserveRoom() {
		// TODO - implement Hotel.reserveRoom
		throw new UnsupportedOperationException();
	}

	// automatically generate our rooms in the hotel
	private void createRooms() {
		// just for testing
		ArrayList<LocalDate> bookedDates = new ArrayList<>();
		bookedDates.add(LocalDate.of(2024, 4, 20));
		// iterate up to arbitrary number
		for (int i = 0; i < 10; i++) {

			// create a single and a double on each iteration
			Room newSingleRoom = new Room(100, "single", bookedDates);
			Room newDoubleRoom = new Room(120, "double", null);
			// push both of these onto the rooms array. We need to * 2 so that we move along
			// the array by 2
			hotelRooms[i * 2] = newSingleRoom;
			hotelRooms[i * 2 + 1] = newDoubleRoom;

		}
	}

	// getters
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}