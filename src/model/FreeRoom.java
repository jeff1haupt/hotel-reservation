package model;

public class FreeRoom extends Room{


        public FreeRoom(String roomNumber, Double roomPrice, RoomType roomType) {
                super(roomNumber, roomPrice, roomType);
        }

        @Override
        public String toString() {
                return "Free room details - Room Number: " + roomNumber + "  SINGLE OR DOUBLE: " + roomType;
        }
}
