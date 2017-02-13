package org.usfirst.frc.team2353.robot.subsystems;

import org.usfirst.frc.team2353.commands.TrayMove;
import org.usfirst.frc.team2353.robot.OI;
import org.usfirst.frc.team2353.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Tray extends Subsystem {

	private VictorSP trayMotor;
	
	public Tray() {
		trayMotor = new VictorSP(RobotMap.tray);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new TrayMove());
    }
    
    public void moveTray(double speed) {
    	trayMotor.set(speed);
    }
}

