package org.usfirst.frc.team2353.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GearLeft extends CommandGroup {
    public GearLeft() {
    	addSequential(new TimedDrive(0, 0.6, 0, 0, 0.6)); //Drive Forward to the Peg
    	addSequential(new Wait(4)); //Wait for 4 seconds
    	addSequential(new TimedDrive(0, -0.7, 0, 0, 0.2)); //Move Backwards a little
    	addSequential(new Wait(0.5));
    	addSequential(new TimedDrive(-2, 0, 0, 0, 2.5)); //Strafe Right
    	addSequential(new TimedDrive(0, 0.6, 0, 0, 1)); //Move Forward to breach
    }
}
