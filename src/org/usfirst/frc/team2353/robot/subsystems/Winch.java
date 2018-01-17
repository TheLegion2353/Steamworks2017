package org.usfirst.frc.team2353.robot.subsystems;

import org.usfirst.frc.team2353.commands.WinchMove;
import org.usfirst.frc.team2353.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Winch extends Subsystem {

	private WPI_TalonSRX winchRight, winchLeft;

	public Winch(){
		winchRight = new WPI_TalonSRX(RobotMap.winchRight);
		winchLeft = new WPI_TalonSRX(RobotMap.winchLeft);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new WinchMove());
    }
    
    public void moveWinch(double speed){
    	winchLeft.set(speed);
    	winchRight.set(speed);
    }
}

