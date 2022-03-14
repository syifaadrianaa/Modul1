public class Elevator {
	public boolean doorOpen = false;
	public int currentFloor = 1;
	public int TOP_FLOOR = 5;
	public int BOTTOM_FLOOR = 1;
	public void openDoor() {
		System.out.println("Opening Door.");
		doorOpen = true;
		System.out.println("Door is open.");
	}
	public void closeDoor() {
		System.out.println("Closing door.");
		doorOpen = false;
		System.out.println("Door is closed.");
		
	}
	public void goUp() {
		System.out.println("Going Up one floor.");
		currentFloor++;
		System.out.println("Floor : " +currentFloor);
	}
	public void goDown() {
		System.out.println("Going Down one floor.");
		currentFloor--;
		System.out.println("Floor : " +currentFloor);
	}
	public void setFloor(int desiredFloor) {
		while (currentFloor != desiredFloor) {
			if(currentFloor < desiredFloor) {
				goUp();
			}else {
				goDown();
			}
		}
	}
	public int getFloor() {
		return currentFloor;
	}
	public boolean checkDoorStatus() {
		return doorOpen;
	}
}
