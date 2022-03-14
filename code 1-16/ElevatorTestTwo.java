
public class ElevatorTestTwo {
	public static void main(String[] args) {
		Elevator myElevator = new Elevator();
		myElevator.doorOpen = false;
		myElevator.openDoor();
		myElevator.currentFloor = 3;
		myElevator.closeDoor();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.TOP_FLOOR = 7;
		myElevator.closeDoor();
		myElevator.goDown();
		myElevator.BOTTOM_FLOOR = 0;
		int curFloor = myElevator.getFloor();
		System.out.println("Current Floor : " + curFloor);
		myElevator.setFloor(curFloor+1);
		myElevator.openDoor();
	}
}
