package org.usfirst.frc.team2353.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static Joystick xboxController;

	// Xbox Button mappings
	public final static int AButtonNum = 1;
	public final static int BButtonNum = 2;
	public final static int YButtonNum = 4;
	public final static int XButtonNum = 3;
	public final static int left_Bumper = 5;
	public final static int right_Bumper = 6;
	public final static int select_Button = 6;
	public final static int start_Button = 7;

	// Xbox axis numbers
	public final static int leftYAxis = 1;
	public final static int leftXAxis = 0;
	public final static int rightYAxis = 5;
	public final static int rightXAxis = 4;

	public final static int left_Trigger = 2;
	public final static int right_Trigger = 3;

	public JoystickButton AButton, BButton, YButton, XButton;

	public OI() {
		xboxController = new Joystick(RobotMap.xboxPort);

		AButton = new JoystickButton(xboxController, AButtonNum);
		BButton = new JoystickButton(xboxController, BButtonNum);
		YButton = new JoystickButton(xboxController, YButtonNum);
		XButton = new JoystickButton(xboxController, XButtonNum);

	}

	public static double getXboxLeftXAxis() {
		double x_axis = xboxController.getRawAxis(leftXAxis);

		if (x_axis > -.2 && x_axis < .2)
			x_axis = 0;

		return x_axis;
	}
	
	public static double getXboxLeftYAxis() {
		double y_axis = xboxController.getRawAxis(leftYAxis);

		if (y_axis > -.2 && y_axis < .2)
			y_axis = 0;

		return -y_axis;
	}
	
	public static double getXboxRightXAxis() {
		double x_axis = xboxController.getRawAxis(rightXAxis);

		if (x_axis > -.2 && x_axis < .2)
			x_axis = 0;

		return -x_axis;
	}

	public static double getTriggerValue() {
		double leftTriggerSpeed = xboxController.getRawAxis(left_Trigger);
		if (leftTriggerSpeed < .1) {
			leftTriggerSpeed = 0;
		}

		double rightTriggerSpeed = xboxController.getRawAxis(right_Trigger);
		if (rightTriggerSpeed < .1) {
			rightTriggerSpeed = 0;
		}

		double triggerSpeed = rightTriggerSpeed - leftTriggerSpeed;

		return triggerSpeed;
	}
}
