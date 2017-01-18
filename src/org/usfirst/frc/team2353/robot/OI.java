package org.usfirst.frc.team2353.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	private static Joystick xboxController;

	// Xbox Button mappings
	private final static int AButtonNum = 0;
	private final static int BButtonNum = 1;
	private final static int YButtonNum = 3;
	private final static int XButtonNum = 2;
	private final static int left_Bumper = 4;
	private final static int right_Bumper = 5;
	private final static int select_Button = 6;
	private final static int start_Button = 7;

	// Xbox axis numbers
	private final static int leftYAxis = 1;
	private final static int leftXAxis = 0;
	private final static int rightYAxis = 3;
	private final static int rightXAxis = 2;

	private final static int left_Trigger = 2;
	private final static int right_Trigger = 3;

	private JoystickButton AButton, BButton, YButton, XButton;

	public OI() {
		xboxController = new Joystick(RobotMap.xboxPort);

		AButton = new JoystickButton(xboxController, AButtonNum);
		BButton = new JoystickButton(xboxController, BButtonNum);
		YButton = new JoystickButton(xboxController, YButtonNum);
		XButton = new JoystickButton(xboxController, XButtonNum);

	}

	public static double getXboxRightXAxis() {
		double x_axis = xboxController.getRawAxis(rightXAxis);

		if (x_axis > -.2 && x_axis < .2)
			x_axis = 0;

		return x_axis;
	}
	
	public static double getXboxRightYAxis() {
		double y_axis = xboxController.getRawAxis(rightYAxis);

		if (y_axis > -.2 && y_axis < .2)
			y_axis = 0;

		return y_axis;
	}

	public static double getTriggerValue() {
		double leftTriggerSpeed = xboxController.getRawAxis(2);
		if (leftTriggerSpeed < .1) {
			leftTriggerSpeed = 0;
		}

		double rightTriggerSpeed = xboxController.getRawAxis(3);
		if (rightTriggerSpeed < .1) {
			rightTriggerSpeed = 0;
		}

		double triggerSpeed = rightTriggerSpeed - leftTriggerSpeed;

		return triggerSpeed;
	}
}
