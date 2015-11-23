package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class EasyRobot {
public static void main(String[] args) {
Robot Better=new Robot();
for (int i = 0; i < 360; i++) {
	Better.penDown();
	Better.move(5);
	Better.turn(1);
	Better.sparkle();
	
	
	
}
}
}
