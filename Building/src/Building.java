import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    public Building(int numberOfFloors) {
        this.rooms = new ArrayList<>();
        this.numberOfFloors = numberOfFloors;
    }
public int getNumberOfFloors() {
        return numberOfFloors;
}
public ArrayList<Room> getRooms() {
        return rooms;
}
public void setNumberOfFloors(int numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
}
    public void addRoom(Room room) {
        rooms.add(room);
}
public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
}

}
