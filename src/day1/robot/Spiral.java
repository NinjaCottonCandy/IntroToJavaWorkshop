package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot epic=new Robot();
		// 5. Set your robot's pen to the down position
         epic.penDown();
		// 3. Set the robot to go at max speed (10)
         epic.setSpeed(100);
		// 4. Do the following (steps 7-9) 75 times
         for (int i = 0; i <1000; i++) {
			
		
  		 	// 7. Change the pen color to random 
            epic.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	         epic.move(2*i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
	         epic.turn(360/30);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	         epic.setPenWidth(5*i);
			// 9. Set the pen width to i
         }   
	}
}
