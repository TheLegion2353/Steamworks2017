package org.usfirst.frc.team2353.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//USB Ports
	public final static int xboxPort = 1; 
		
	//Motors
	public final static int frontLeftMotor = 4, rearLeftMotor = 6, frontRightMotor = 5, rearRightMotor = 7;
	public final static int tray = 0, gear = 6, winchRight = 8, winchLeft = 2, roller = 1;
	
	//Black: Roller
	//Red: Winch Left
}
