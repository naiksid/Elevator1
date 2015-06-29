package elevator;

import elevator.Elevator;
import java.util.Scanner;
public class ElevatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator ob=new Elevator();
		Elevator obdup=new Elevator();
		ob.openDoors();
		int current_floor=0;
		while(current_floor>=0)
		{
			System.out.print("Present floor="+current_floor+"\n");
			System.out.println("Which floor you want to go?\n");
			Scanner obj = new Scanner(System.in);
			int going_to= obj.nextInt();;
			ob.goToFloor(going_to);
			
			if(current_floor<going_to){
				obdup.goingDown();
				ob.print(current_floor);
			}
			else if(current_floor>going_to){
				obdup.goingUp();
				ob.print(current_floor);
			}
			else if(current_floor==going_to)
			{
				ob.print(current_floor);
			}
			obdup.closeDoors();
			current_floor=going_to;
		}
	}		
}
