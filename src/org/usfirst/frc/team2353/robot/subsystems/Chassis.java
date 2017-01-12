package org.usfirst.frc.team2353.robot.subsystems;

import org.usfirst.frc.team2353.robot.RobotMap;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
	private TalonSRX frontLeftMotor, rearLeftMotor,frontRightMotor, rearRightMotor;
	private RobotDrive drive;

	public Chassis() {
		frontLeftMotor = new TalonSRX(RobotMap.frontLeftMotor);
		rearLeftMotor = new TalonSRX(RobotMap.rearLeftMotor);
		frontRightMotor = new TalonSRX(RobotMap.frontRightMotor);
		rearRightMotor = new TalonSRX(RobotMap.rearRightMotor);
    	drive = new RobotDrive(frontLeftMotor, rearLeftMotor,frontRightMotor, rearRightMotor);
	}

    public void initDefaultCommand() {
    	//setDefaultCommand(new );
    }
    
    public void mecanumDrive_Polar(double magnitude, double direction, double rotation) {
    	drive.mecanumDrive_Polar(magnitude, direction, 1);
    }

}

