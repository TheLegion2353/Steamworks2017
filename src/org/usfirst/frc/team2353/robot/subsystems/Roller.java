package org.usfirst.frc.team2353.robot.subsystems;

import org.usfirst.frc.team2353.commands.RollerMove;
import org.usfirst.frc.team2353.robot.RobotMap;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Roller extends Subsystem {

    private TalonSRX roller;
    
    public Roller() {
    	roller = new TalonSRX(RobotMap.roller);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new RollerMove());
    }
    
    public void moveRoller(double speed) {
    	roller.set(speed);
    }
}

