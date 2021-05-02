import model.Customer;
import model.FreeRoom;
import model.Room;
import model.RoomType;

public class App {

    public static void main(String[] args) {

        FreeRoom free = new FreeRoom("101", RoomType.DOUBLE);
        Room room = new Room("102", 109.55, RoomType.SINGLE);
        Customer customer = new Customer("Jeff", "Haupt", "jeff@gmail.com");

        System.out.println(free.toString());
        System.out.println(room.toString());
        System.out.println(customer.toString());
    }
}
