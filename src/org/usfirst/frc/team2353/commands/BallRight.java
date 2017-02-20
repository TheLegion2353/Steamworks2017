package org.usfirst.frc.team2353.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class BallRight extends CommandGroup {

    public BallRight() {
    	addSequential(new TimedDrive(0, 5, 0, 0, 0.25)); //Move Forward
    	addSequential(new TimedDrive(0, 0, -5, 0, 0.2)); //Turn 45 Degrees
    	addSequential(new TimedDrive(0, -5, 0, 0, 0.4)); //Move backwards to the boiler
    	addSequential(new DumpBalls(0.4)); //Dump balls
    	addSequential(new TimedDrive(0, 5, 0, 0, 0.4)); //Move Forward
    	addSequential(new TimedDrive(0, 0, 5, 0, 0.4)); //Turn 45 degrees to Breach
    	addSequential(new TimedDrive(0, 5, 0, 0, 1)); //Move forward to breach
    }
}
