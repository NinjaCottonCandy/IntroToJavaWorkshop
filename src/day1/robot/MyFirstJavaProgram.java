package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot CandyRobot = new Robot();
		CandyRobot.move(100);
		CandyRobot.moveTo(399,589);
		CandyRobot.sparkle();
		CandyRobot.penDown();
		CandyRobot.miniturize();
		CandyRobot.setRandomPenColor();
		CandyRobot.turn(500);
		CandyRobot.unSparkle();
		

		
		
	}
}
