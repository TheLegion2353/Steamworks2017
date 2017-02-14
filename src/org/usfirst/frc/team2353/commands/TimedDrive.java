package org.usfirst.frc.team2353.commands;

import org.usfirst.frc.team2353.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TimedDrive extends Command {

	private double x, y, rotation, gyro, time;
	
    public TimedDrive(double x, double y, double rotation, double gyro, double time) {
        requires(Robot.chassis);
        
        setTimeout(time);
        
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        this.gyro = gyro;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.mecanumDrive_Cartesian(x, y, rotation, gyro);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
