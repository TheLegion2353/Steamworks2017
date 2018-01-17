package org.usfirst.frc.team2353.robot.subsystems;

import org.usfirst.frc.team2353.commands.RollerMove;
import org.usfirst.frc.team2353.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Roller extends Subsystem {

    private WPI_TalonSRX roller;
    
    public Roller() {
    	roller = new WPI_TalonSRX(RobotMap.roller);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new RollerMove());
    }
    
    public void moveRoller(double speed) {
    	roller.set(speed);
    }
}

