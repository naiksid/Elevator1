package elevator;


public class Elevator {
	int currentfloor;
	int headingfloor;
	boolean movement;
	boolean doors;
	
	public void openDoors() {
		// TODO Auto-generated method stub
		doors=true;
		System.out.println("\nDoors are open\n");
		
	}

	public void goToFloor(int b) {
		// TODO Auto-generated method stub
		headingfloor=b;
		System.out.println("\nLift is heading to floor="+headingfloor);
	}

	public void goingUp() {
		// TODO Auto-generated method stub
		movement=true;
	}

	public void print(int a) {
		// TODO Auto-generated method stub
		currentfloor=a;
		 System.out.print("\n@@Heading please wait@@\n");
		 if(headingfloor>currentfloor)
		 {
			 System.out.print("\nMovement up\n");
		 }
		 else
		 {
			 System.out.print("\nMovement down\n");
		 }		
	}

	public void closeDoors() {
		// TODO Auto-generated method stub
		doors=false;
		System.out.println("\nDoors are close\n");
	}

	public void goingDown() {
		// TODO Auto-generated method stub
		movement=false;
	}

}
