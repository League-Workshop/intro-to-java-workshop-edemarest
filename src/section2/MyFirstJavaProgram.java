package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot walle = new Robot();
		walle.moveTo(200, 400);
		
		
	for (int i = 0; i < 4; i++) {
		walle.setSpeed(100);
		walle.penDown();
		walle.move(300);
		walle.turn(90);
		}
	
	
	
	}
}
