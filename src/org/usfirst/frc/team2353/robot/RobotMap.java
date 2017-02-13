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
	public final static int frontLeftMotor = 0, rearLeftMotor = 1, frontRightMotor = 2, rearRightMotor = 3;
	public final static int tray = 4, gear = 5;
}
