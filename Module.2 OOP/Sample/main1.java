import java.util.*;

class Room{
	static int roomid;
	static String roomType;
	static double price;
	Static boolean isAvailable;
	
	Room(int roomid, String roomType, double price, boolean isAvailable){
		this roomid = roomid;
		this roomType = roomType;
		this price = price;
		this isAvailable = isAvailable;
	}
}

class LuxuryRoom extends Room{
	static String amenities;
	LuxuryRoom(String amenities){
		super(room);
		this amenities = amenities;
	}
}

class EconomyRoom extends Room{
	static boolean acAvailable;
	EconomyRoom()
}