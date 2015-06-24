package elevator;

import elevator.Elevator;

public class ElevatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator ob=new Elevator();
		Elevator obdup=new Elevator();
		ob.openDoors();
		System.out.print("\nPresent floor=");
		int a= 1;
		System.out.print("\nDesired floor=");
		int b= 0;
		ob.goToFloor(b);

		obdup.goingUp();
		obdup.goingUp();
		ob.print(a);
		obdup.closeDoors();
	}

}
