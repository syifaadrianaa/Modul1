public class ElevatorTestTwo {
	public static void main(String[] args) {
		Elevator myElevator = new Elevator();
		myElevator.setOpenDoor();
		myElevator.getCheckDoorStatus();
		myElevator.setFloor(0);
		myElevator.getFloor();
		myElevator.setCloseDoor();
		myElevator.setGoUp();
		myElevator.setOpenDoor();
	}
}
