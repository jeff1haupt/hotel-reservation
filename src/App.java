import model.FreeRoom;
import model.RoomType;

public class App {

    public static void main(String[] args) {
        FreeRoom free = new FreeRoom("100", 0.00, RoomType.SINGLE);

        System.out.println(free.toString());
    }
}
