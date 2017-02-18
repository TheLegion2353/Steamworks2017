package org.usfirst.frc.team2353.robot.subsystems;

import org.usfirst.frc.team2353.commands.MecanumDrive;
import org.usfirst.frc.team2353.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
	private Victor frontLeftMotor, rearLeftMotor,frontRightMotor, rearRightMotor;
	private static RobotDrive drive;

	public Chassis() {
		frontLeftMotor = new Victor(RobotMap.frontLeftMotor);
		rearLeftMotor = new Victor(RobotMap.rearLeftMotor);
		frontRightMotor = new Victor(RobotMap.frontRightMotor);
		rearRightMotor = new Victor(RobotMap.rearRightMotor);
    	drive = new RobotDrive(frontLeftMotor, rearLeftMotor,frontRightMotor, rearRightMotor);
    	
    	drive.setInvertedMotor(MotorType.kFrontLeft, true);
    	drive.setInvertedMotor(MotorType.kRearLeft, true);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new MecanumDrive());
    }
    
    public void mecanumDrive_Cartesian(double x, double y, double rotation, double gyro) {
        drive.mecanumDrive_Cartesian(x, y, rotation, gyro);
    }
}

