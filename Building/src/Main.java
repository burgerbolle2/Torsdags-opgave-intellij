public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(1, 2);
        Room room2 = new Room(2, 3);
        Room room3 = new Room(4, 4);

        Building building = new Building(3);

        building.addRoom(room1);
        building.addRoom(room2);
        building.addRoom(room3);


        for (Room room : building.getRooms()) {
            System.out.println("Room with " + room.getNumberOfLamps() + " lamps and " + room.getNumberOfWindows() + " windows.");
        }

        int totalLamps = countLampsInBuilding(building);
        System.out.println("Total number of lamps in the building: " + totalLamps);

    }
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;

        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

}