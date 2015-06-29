package elevator;


public class Elevator {
	int currentfloor;
	int headingfloor;
	boolean movement;
	boolean doors;
	
	

	public void goToFloor(int b) {
		// TODO Auto-generated method stub
		headingfloor=b;
		System.out.println("Lift is heading to floor="+headingfloor);
	}

	public void goingUp() {
		// TODO Auto-generated method stub
		movement=true;
	}

	public void print(int a) {
		// TODO Auto-generated method stub
		currentfloor=a;
		 System.out.print("Heading please wait\n");
		 if(headingfloor>currentfloor)
		 {
			 System.out.print("Moving up\n");
		 }
		 else
		 {
			 System.out.print("Moving down\n");
		 }		
	}

	public void openDoors() {
		// TODO Auto-generated method stub
		doors=true;
		System.out.println("Doors are open\n");
		
	}
	
	public void closeDoors() {
		// TODO Auto-generated method stub
		doors=false;
		System.out.println("Doors are close\n");
	}

	public void goingDown() {
		// TODO Auto-generated method stub
		movement=false;
	}

}