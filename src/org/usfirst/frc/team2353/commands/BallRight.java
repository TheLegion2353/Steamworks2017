package org.usfirst.frc.team2353.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class BallRight extends CommandGroup {

    public BallRight() {
    	addSequential(new TimedDrive(0, 0.4, 0, 0, 1)); //Move Forward
    	addSequential(new TimedDrive(0, 0, 0.4, 0, 1)); //Turn 45 Degrees
    	addSequential(new TimedDrive(0, -0.4, 0, 0, 1.2)); //Move backwards to the boiler
    	addSequential(new Wait(1.5));
    	addSequential(new DumpBalls(1)); //Dump balls
    	addSequential(new Wait(2));
    	addSequential(new TimedDrive(0, 0.4, 0, 0, 1)); //Move Forward
    	addSequential(new TimedDrive(0, 0, -0.4, 0, 1.07)); //Turn 45 degrees to Breach
    	addSequential(new TimedDrive(0, 0.6, 0, 0, 1)); //Move forward to breach
    }
}
