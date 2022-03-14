public class ElevatorTest {

	public static void main(String[] args) {
		Elevator myElevator = new Elevator();
		myElevator.doorOpen = true;
		myElevator.currentFloor = 2;
		myElevator.TOP_FLOOR = 6;
		myElevator.BOTTOM_FLOOR = 0;
		System.out.println (myElevator.doorOpen);
		myElevator.openDoor();
		System.out.println (myElevator.currentFloor);
		myElevator.closeDoor();
		System.out.println (myElevator.TOP_FLOOR);
		myElevator.goUp();
	System.out.println(myElevator.BOTTOM_FLOOR);
		myElevator.goDown();
		
	myElevator.setFloor(myElevator.TOP_FLOOR);
		myElevator.openDoor();

	}

}
