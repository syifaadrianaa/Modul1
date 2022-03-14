public class Elevator {
	private boolean doorOpen = false;
	private int currentFloor = 1;
	private int TOP_FLOOR = 5;
	public int BOTTOM_FLOOR = 1;
	
	public void setOpenDoor() {
		System.out.println("Opening Door.");
		doorOpen = true;
		System.out.println("Door is open.");
	}
	public void setCloseDoor() {
		System.out.println("Closing door.");
		doorOpen = false;
		System.out.println("Door is closed.");
		
	}
	public void setGoUp() {
		System.out.println("Going Up one floor.");
		currentFloor++;
		System.out.println("Floor : " +currentFloor);
	}
	public void setGoDown() {
		System.out.println("Going Down one floor.");
		currentFloor--;
		System.out.println("Floor : " +currentFloor);
	}
	public void setFloor(int desiredFloor) {
		while (currentFloor != desiredFloor) {
			if(currentFloor < desiredFloor) {
				setGoUp();
			}else {
				setGoDown();
			}
		}
	}
	public int getFloor() {
		return currentFloor;
	}
	public boolean getCheckDoorStatus() {
		return doorOpen;
	}
}
