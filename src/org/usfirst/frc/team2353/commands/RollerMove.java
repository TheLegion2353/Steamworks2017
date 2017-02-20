package org.usfirst.frc.team2353.commands;

import org.usfirst.frc.team2353.robot.OI;
import org.usfirst.frc.team2353.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RollerMove extends Command {
	
	private double speed;

    public RollerMove() {
    	speed = 0;
    	requires(Robot.roller);
    }

    // Called just before this Command runs the first time  && OI.xboxController.getRawButton(OI.YButtonNum) == true
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run  && OI.xboxController.getRawButton(OI.YButtonNum) == false
    protected void execute() {
    	if(OI.xboxController.getRawButton(OI.left_Bumper) == true) {
			speed = -0.3;
		}
    	else {
			speed = 0;
		}
    	Robot.roller.moveRoller(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
