package frc.lib;

import edu.wpi.first.wpilibj.XboxController;

public class StadiaController extends XboxController {
	public StadiaController(int port) {
		super(port);
	}

	@Override
	public double getLeftX() {
		return super.getRawAxis(0);
	}

	@Override
	public double getLeftY() {
		return super.getRawAxis(1);
	}

	@Override
	public double getRightX() {
		return super.getRawAxis(3);
	}

	@Override
	public double getRightY() { return super.getRawAxis(4); }

	public boolean getAButton() { return super.getRawButton(1); }

	public boolean getBButton() { return super.getRawButton(2); }

	public boolean getXButton() { return super.getRawButton(3); }

	public boolean getYButton() { return super.getRawButton(4); }

	public boolean getLeftBumper() { return super.getRawButton(5); }

	public boolean getRightBumper() { return super.getRawButton(6); }

	public boolean getLeftStickButton() { return super.getRawButton(7); }

	public boolean getRightStickButton() { return super.getRawButton(8); }

	// this is the button with three dots
	public boolean getEllipsisButton() { return super.getRawButton(9); }

	// the button with three lines, like a hamburger menu
	public boolean getThreeLineButton() { return super.getRawButton(10); }

	// the "stadia button" labeled with the stadia logo
	public boolean getStadiaButton() { return super.getRawButton(11); }

	public boolean getRightTrigger() { return super.getRawButton(12); }

	public boolean getLeftTrigger() { return super.getRawButton(13); }

	// the button with the differing dot sizes in seemingly random locations
	public boolean getWeirdButton() { return super.getRawButton(14); }

	// the button that looks like the fullscreen logo
	public boolean getFullscreenButton() { return super.getRawButton(15); }
}
